import java.util.Scanner;
import java.util.ArrayList;
public class C11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		//enter 10 integers to a list
		//displays the distinct integers seperated by exactly one space
		for (int i = 0; i < 10; i ++)
		{
			list.add(input.nextInt());
		}
		System.out.println("before remove dup\n");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		removeDuplicate(list);
		System.out.println("After remove dup\n");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list);
		
	}
	
	//remove duplicate elements from an array list of integers
	 public static void removeDuplicate(ArrayList<Integer> list) {

	        ArrayList<Integer> temp = new ArrayList<>();
	        for (int i = 0; i < list.size(); i++) {

	            if (!temp.contains(list.get(i))) {
	                temp.add(list.get(i));
	            }
	        }
	        list.clear();
	        list.addAll(temp);

}
}