import java.util.Scanner;
public class C185 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter i limit: " );
		int i = input.nextInt();
		
		for (int z = 1; z < i; z++)
		{
			System.out.println(getSeriesSum(z));
		}
		
	}
	
	public static double getSeriesSum(int z)
	{
		if (z <= 0)
			return 0;
		else
			return ( z/(2*z + 1.0) ) + getSeriesSum(z-1);
	}

}
