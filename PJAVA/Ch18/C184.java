import java.util.Scanner;
public class C184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rdr1 = new Scanner(System.in);
		System.out.println("display sum of series 1/i, enter i");
		int i = rdr1.nextInt();
		for (int k = 1; k < i; k++)
			System.out.println(getSumOfSeries(k));
		
	}
	
	public static double getSumOfSeries(int iP)
	{
		
		if (iP <= 0)
			return 0;
		else if (iP == 1)
			return 1;
		else
			return (1.0/iP) + getSumOfSeries(iP-1);
		
	}

}
