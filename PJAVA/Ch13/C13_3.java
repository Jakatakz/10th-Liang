import java.math.BigInteger;
import java.util.ArrayList;

public class C13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Number> arrList1 = new ArrayList<>();
		arrList1.add((new BigInteger("2147483648")));
		arrList1.add(1);
		arrList1.add(-4);
		arrList1.add(55.5);
		sort(arrList1);
		System.out.println(arrList1.toString());
	}
	
	public static void sort(ArrayList<Number> list)
	{
		Number tempElement;
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			//System.out.println("1st for");
			for (int k = i+1; k < list.size(); k++)
			{
				//System.out.println("2nd for");
				if (list.get(k).longValue() < (list.get(i).longValue() ) )
				{
					//System.out.println("inside if");
					tempElement = list.get(i);
					list.set(i, list.get(k));
					list.set(k,tempElement);
				}
				//System.out.println(list.toString());
			}
		}
		
	}

}
