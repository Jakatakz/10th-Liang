import java.util.Scanner;
public class C183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		System.out.println("prompt user for 2 integers");
		Scanner rdr1 = new Scanner(System.in);
		int num1 = rdr1.nextInt();
		int num2 = rdr1.nextInt();
		
		//display their GCD
		System.out.println(getGCD(num1, num2, c));
	}
	
	
	public static int getGCD(int num1P, int num2P, int c)
	{
		c++;
		int gcd;
		if (num1P % num2P == 0)
			gcd = num2P;
		else
			gcd = getGCD(num2P, num1P % num2P, c);
		
		System.out.println("getGCD access count: " + c);
		return gcd;
	}

}
