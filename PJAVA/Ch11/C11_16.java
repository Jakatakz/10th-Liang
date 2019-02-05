import java.util.Scanner;
import java.util.ArrayList;
public class C11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write addition quiz
		//alert user if answer is entered again
		
		ArrayList<Integer> wrongAnswers = new ArrayList<>();
		getQ(wrongAnswers);
	}
	
	public static void getQ(ArrayList<Integer> wrongAnswers)
	{
		
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		System.out.println("What is: " + a + " + " + b + " ?");
		int answer = input.nextInt();
		while (answer != (a+b))
		{
			if (wrongAnswers.contains(answer))
			{
				System.out.println("already entered");
			}
			else
			{
				System.out.println("Wrong");
				wrongAnswers.add(answer);
			}
			System.out.println("arraylist size" + wrongAnswers.size());
			System.out.println("Try again: ");
			answer = input.nextInt();
			
		}
					
				
		
		System.out.println("correct");
			
	}

}
