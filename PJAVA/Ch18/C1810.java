import java.util.Scanner;
public class C1810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("prompt user to enter a string and a character: ");
		String str = input.next();
		char c = input.next().charAt(0);
		System.out.println("count: " + count(str, c));
	}
	
	
	public static int count(String str, char a)
	{
		System.out.println("\nstr: " + str);
		int n = 0;
		int strLastIndex = str.length()-1;
		System.out.println("strLastIndex: " + strLastIndex);
		if (strLastIndex < 0)
			return n;
		if ((str.charAt(strLastIndex)) != a)
		{
			System.out.print(str.charAt(strLastIndex));
			System.out.print(" != " + a);
			return count(str.substring(0, strLastIndex), a);
		}
		else
		{
			System.out.print(str.charAt(strLastIndex));
			System.out.print(" == " + a);
			return (n+1) + count(str.substring(0, strLastIndex),a);
		}
		
		
		
	}

}
