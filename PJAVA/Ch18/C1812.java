import java.util.Scanner;
public class C1812 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter string");
		String str = input.next();
		
		//display its reversal
		reverseDisplay(str);
	}
	
	public static void reverseDisplay(String value)
	{
		//System.out.println("\nvalue: " + value + " value.length(): " + value.length());
		if (value.length() > 0)
			reverseDisplay(value, value.length()-1);
		
	}
	
	//recursion helper method
	public static void reverseDisplay(String value, int high)
	{
		//System.out.print("value substring " + value.substring(0, high) + " ");
		System.out.print(value.charAt(high));
		reverseDisplay(value.substring(0, high));
	}

}
