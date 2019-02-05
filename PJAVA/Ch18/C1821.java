import java.util.Scanner;
public class C1821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a decimal number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		//display its binary equivalent
		//System.out.println("decimal: " + num + " \nbinary: " + dec2Bin(num));
		
		//test
		System.out.println("test: " + Integer.toBinaryString(num));
		System.out.println(12>>1);
		System.out.println((12>>1)>>1);
		System.out.println(((12>>1)>>1)>>1);
	}
	
}
