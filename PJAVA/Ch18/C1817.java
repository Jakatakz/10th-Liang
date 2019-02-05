import java.util.Scanner;
public class C1817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter a list of characters in one line, a character, and display the number of occurences of the character in the list");
		String str = input.nextLine();
		char[] chars = str.toCharArray();
		char c = input.next().charAt(0);
		
		System.out.println("str: " + str);
		System.out.println("c: " + c);
		
		System.out.println("# of occurences of " + c + " in the list: " + count(chars, c));
		
	}
	
	public static int count(char[] chars, char ch)
	{
		return count(chars, ch, 0);
	}
	
	//helper
	public static int count(char[] chars, char ch, int high)
	{
		
		int countOccurences = ((chars[high] == ch) ? 1 : 0);
		if (high != chars.length-1)
			return countOccurences + count(chars, ch, ++high);
		else
			return countOccurences;
			
			
	}

}
