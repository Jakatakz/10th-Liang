import java.util.Random;
import java.util.Scanner;

public class c12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random o = new Random();
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = o.nextInt(10);
		}
/*		for (int a: array)
		{
			System.out.print(array[a]);
		}*/
		
		System.out.println("Enter index of the array: ");
		try 
		{
			Scanner input = new Scanner(System.in);
			int index = input.nextInt();
			System.out.println("index: " + index + " 's element value: " + array[index]);
		} catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Out of Bounds");
			ex.printStackTrace();
		}
		
	}

}
