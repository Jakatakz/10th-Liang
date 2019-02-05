import java.util.Scanner;
public class C182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("prompt user for index");
		int prompt1 = reader.nextInt();
		System.out.println(getFibonacciNumberOfIndex(prompt1));
	}
	
	public static int getFibonacciNumberOfIndex(int promptParam)
	{
		if (promptParam == 0)
			return 0;
		if (promptParam == 1)
			return 1;
		
		
		int f0 = 0;
		int f1 = 1;
		int currentFib;
		
		for (int i = 2; i <= promptParam; i++)
			{
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
		return f1;
	}

}
