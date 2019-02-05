import java.util.Scanner;
import java.io.*;
public class C189 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("enter a string");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String str2 = "";
		
		File file1 = new File("C189.txt");
		if (file1.createNewFile())
			System.out.println("created");
		else
			System.out.println("already exists");
		
		
		try (PrintWriter writer1 = new PrintWriter(file1))
		{
			writer1.print(str);
		}
		
		try (Scanner reader1 = new Scanner(file1))
		{
			while (reader1.hasNext())
			{
				str2 = reader1.next();
			}
		
			System.out.println("str2: " + str2);
			reverseDisplay(str);
		}
		
		
		
	}
	
	public static void reverseDisplay(String value)
	{
		if (value.length() == 0)
			return;
		System.out.print(value.substring(value.length()-1));
		reverseDisplay(value.substring(0, value.length()-1));
	}

}
