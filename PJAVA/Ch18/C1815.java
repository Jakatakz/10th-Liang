import java.util.Scanner;
public class C1815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter string");
		String str = input.next();
		System.out.println("enter letter");
		char c = input.next().charAt(0);
		System.out.println("number of occurences of " + c);
		System.out.println(count(str, c));
	}
	
	public static int count(String str, char a)
	{
		return count(str, a, str.length()-1);
	}
	
	public static int count(String str, char a, int index)
	{
		int count = 0;
		if (index < 0)
			return count;
		
		if (str.charAt(index) == a)
			return (count+1) + count(str.substring(0, index+1), a, index-1);
		else
			return count(str.substring(0, index+1), a , index-1);
			
			
	}

}
