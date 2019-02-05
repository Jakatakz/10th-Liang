import java.util.Scanner;
public class C1814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter string");
		String str = input.next();
		
		System.out.println("num of uppercase: " + countUpperCase(str));
	}
	
	public static int countUpperCase(String str)
	{
		return countUpperCase(str, 0, 0);
	}
	
	public static int countUpperCase(String str, int index, int count)
	{
		//System.out.println("COUNT: " + count);
		//System.out.println(" sub : " + str.substring(index, index+1));
		//System.out.println("str: " + str + " index: " + index + " count: " + count);
		if (index == str.length())
			return count;
		
		if (str.substring(index, index+1).matches("[A-Z]"))
		{
			//System.out.println("str2: " + str.substring(index, index+1) + " count: " + count);
			return countUpperCase(str, ++index, ++count);
		}
		else
		{
			//System.out.println("str2: " + str.substring(index, index+1) + " count: " + count);
			return countUpperCase(str, ++index, count);
		}
	}

}
