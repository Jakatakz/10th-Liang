import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class C11_11_test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prompt 5 numbers
		//store them in an arraylist
		//display in increasing order
		ArrayList<Integer> list = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: " );
		for (int i = 0; i<5; i++)
		{
			list.add(input.nextInt());
		}
		
		for (int i = 0; i < 5; i ++)
		{
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		
		System.out.println("After sort");
		for (int i = 0; i < 5; i ++)
		{
			System.out.println(list.get(i));
		}
		
	}
	
	

}
