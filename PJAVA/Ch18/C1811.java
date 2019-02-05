import java.util.Scanner;
public class C1811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter integers");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(sumDigits(num));
	}
	
	public static int sumDigits(long n)
	{
		int sum = 0;
		if (n % 10 == 0)
			return sum;
		else 
		{
			sum += (n % 10);
			return sum + sumDigits(n/10);
		}
	}

}
