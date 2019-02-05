import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class C11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 strings to display them in reverse order");
		//ArrayList<String> list = new ArrayList<>();
		C11_10_Stack list = new C11_10_Stack();
		
		for (int i = 0; i < 5; i++)
		{
			list.push(input.nextLine());
		}
		
		System.out.println("Before reverse");
		for (int i = 0; i < 5; i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\nAfter reverse");
		while(!list.isEmpty2())
		{
			//System.out.println("list is not empty");
			System.out.print(list.pop() + " ");
		}
		
		input.close();
		/*System.out.println("Before reverse");
		for (int i = 0; i < 5; i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		//print reverse
		Collections.reverse(list);
		System.out.println("\nAfter reverse");
		for (int i = 0; i < 5; i++)
		{
			System.out.print(list.get(i) + " ");
		}
		*/
	}

}
