import java.util.Scanner;
public class C186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter i: " );
		int i = input.nextInt();
		
		for (int z = 1; z < i; z++)
		{
			System.out.println(m(z));
		}
		
	}
	
	public static double m(int z)
	{
		if (z <= 0)
			return 0;
		else
			return ( z/ (z+1.0) ) + m(z - 1);
	}

}
