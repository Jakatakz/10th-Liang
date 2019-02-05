import java.util.Scanner;
public class C1816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter a list of characters");
		String str = input.nextLine();
		char[] chars = str.toCharArray();
		/*for (int i=0; i < chars.length; i++)
		{
			chars[i] = str.charAt(i);
		}*/
		
		System.out.println("number of uppercase letters: "  + count(chars));
		
	}
	
	public static int count(char[] chars)
	{
		return count(chars, 0);
	}
	
	public static int count(char[] chars, int high)
	{
		int count = Character.isUpperCase(chars[high]) ? 1 : 0;
		
		if (high == chars.length-1)
			return count;
		else
			return count + count(chars, ++high);
	}

}
