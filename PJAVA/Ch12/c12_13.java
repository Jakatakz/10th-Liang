import java.util.Scanner;
import java.io.*;
public class c12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length != 1)
		{
			System.out.println("file args error");
			System.exit(1);
		}
		
		try
		{
			File c12_13_file = new File(args[0]);
			if (c12_13_file.exists())
				System.out.println("c12_13_file exists");
			else
				System.out.println("c12_13_file doesn't exist");
			
			Scanner reader1 = new Scanner(c12_13_file);
			String str;
			int numOfChar = 0;
			int numOfWords = 0;
			int numOfLines = 0;
			while (reader1.hasNextLine())
			{
				//count # of lines
				numOfLines++;
				
				//count # of words
				str = reader1.nextLine();
				System.out.println(str);
				
				str = str.trim();
				char[] numOfWordsArray = str.toCharArray();
				for(char a: numOfWordsArray)
				{
					if ( a == ' ')
						numOfWords++;
				}
				//count # of characters
				str = str.replaceAll("\\s", "");
				numOfChar += str.length();
				//char[] tempStr = str.toCharArray();
				//numOfChar += tempStr.length;
			}
			numOfWords += numOfLines;
			System.out.println("Number of Lines: " + numOfLines);
			System.out.println("Number of Words: " + numOfWords);
			System.out.println("Number of Characters: " + numOfChar);
			reader1.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
