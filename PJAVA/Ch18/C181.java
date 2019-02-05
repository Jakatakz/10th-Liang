import java.math.BigInteger;
import java.util.Scanner;
public class C181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("prompt user for an integer to display its factorial");
		BigInteger fac1 = input.nextBigInteger();
		System.out.println(getFactorial(fac1));
		
	}
	
	public static BigInteger getFactorial(BigInteger fac1Param)
	{
		if (fac1Param.compareTo(BigInteger.ONE) == 0)
			return fac1Param;
		else
			return fac1Param.multiply(getFactorial(fac1Param.subtract(BigInteger.ONE)));
	}

}
