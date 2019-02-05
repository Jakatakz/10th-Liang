import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class C11_4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter sequence of integers ending with 0");

		ArrayList<Integer> list = new ArrayList<>();
		//max(list);
		//Collections.max(list).intValue();
		System.out.println("max: " + max(list));
		System.out.println("sss");
	}

	public static Integer max(ArrayList<Integer> list)
	{
		Scanner input = new Scanner(System.in);
		int temp;
		do {
			temp = input.nextInt();
			if (temp != 0)
				list.add(temp);
		} while (temp != 0);
		

		
		if ((list == null) || (list.isEmpty()))
		{
			System.out.println("return null");
				return null;
		}
		else {
			System.out.println("return max");
			return Collections.max(list);
			
		}
	}
	
}
