import java.util.Scanner;
public class c12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//System.out.println("enter two integers, display their sum");
		boolean continueInput = true;
		do 
		{
			try 
			{
				Scanner input = new Scanner(System.in);
				System.out.println("enter two integers, display their sum");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int sum = num2 + num1;
				continueInput = false;
				input.close();
				System.out.println(sum);
			} catch (Exception ex) 
			{
				//could use input.nextLine() to advance the scanner to the next line
				//essentially flushing it. it clears the buffer and readies the scanner for a new input.
				System.out.println("input incorrect");
				//input.close();
				continue;
			}
			
		} while (continueInput);
		
	}

}
