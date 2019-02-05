import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 
 * (Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking

java Exercise12_11 John filename

removes the string John from the specified file. Your program should get the
arguments from the command line.
 */
public class c12_11 {

	public static void main(String[] args) throws Exception {
		
		
			File file2 = new File("file2.txt");
			
			if (file2.exists())
				System.out.println("file2 exists");
			else
				System.out.println("file2 doesn't exist");
			
			File fileNEW2 = new File("fileNEW2.txt");
			
			if (fileNEW2.exists())
				System.out.println("fileNEW2 exists");
			else
				System.out.println("fileNEW2 doesn't exist");
			
			String str = "";
		try
		{
			PrintWriter writer = new PrintWriter(file2);
			writer.write("java Exercise12_11 John file234name");
			writer.close();
			
			Scanner reader = new Scanner(file2);
			while(reader.hasNext())
			{
				//System.out.println("INSIDE WHILE");
				str += reader.next() + " ";
			}
			reader.close();
			
			str = str.replaceAll("John",  "");
			
			PrintWriter writerTWO = new PrintWriter(fileNEW2);
			writerTWO.write(str);
			//writer.flush();
			writerTWO.close();
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
			
		
			
			
			
		
			
	}

}
