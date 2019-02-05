import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class C13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Number> arrListNums = new ArrayList<>();
		arrListNums.add(new BigInteger("2147483648"));
		arrListNums.add(192);
		arrListNums.add(3);
		arrListNums.add(-55);
		shuffle(arrListNums);
		System.out.println(arrListNums.toString());
		shuffle(arrListNums);
		System.out.println(arrListNums.toString());
	}
	
	public static void shuffle(ArrayList<Number> list)
	{
		Random rnd1 = new Random();
		for (int i = 0; i < list.size(); i++)
		{
			int randomIndex = rnd1.nextInt(list.size() - 1);
			Number tempNum = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, tempNum);
		}
	}

}
