import java.util.ArrayList;
import java.util.Scanner;
public class C11_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		//prompt user to enter two lists, each with 5  integers
		//display their union , numbers are seperated by exactly one space
		System.out.println("Enter two lists, 5 integers each");
		System.out.println("list 1");
		for (int i = 0; i < 5; i ++)
		{
			list1.add(input.nextInt());
		}
		System.out.println("list 2");
		for (int i = 0; i < 5; i ++)
		{
			list2.add(input.nextInt());
		}
		
		System.out.println("union");
		System.out.println(union(list1, list2));
		
	}
	
	//returns the union of two array lists of integers
	public static ArrayList<Integer> union(ArrayList<Integer> list1, 
			ArrayList<Integer> list2)
	{
		list1.addAll(list2);
		return list1;
	}

}
