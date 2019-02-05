import java.io.*;
import java.util.Scanner;
public class c12_12_driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		if (args.length != 1)
		{
			System.out.println("args error");
			System.exit(1);
		}
		
		StringBuilder str = new StringBuilder();
		char[] strArray;
		try
		{
			File c12_12_file = new File(args[0]);
			if (c12_12_file.exists())
				System.out.println("c12_12_file exists");
			else
				System.out.println("c12_12_file doesn't exist");
			
			Scanner reader1 = new Scanner(c12_12_file);
			while(reader1.hasNextLine())
			{
				String strTemp = reader1.nextLine();
				strTemp = strTemp.trim();
				if (strTemp.charAt(0) == '{')
				{
					//strTemp = reader1.nextLine();
					continue;
				}
				else if (strTemp.charAt(0) == '}' || strTemp.endsWith(";") || 
							strTemp.charAt(0) == '/')
					str.append(strTemp + "\r\n");
				else
					str.append(strTemp +" {\r\n");
				
				//strTemp = reader1.nextLine();
					
					
				
			}
		reader1.close();
			
			File c12_12_file2 =  new File("test2.txt");
			if (c12_12_file.exists())
				System.out.println("c12_12_file exists");
			else
				System.out.println("c12_12_file doesn't exist");
			
			PrintWriter printer1 = new PrintWriter(c12_12_file2);
			printer1.write(str.toString());
			printer1.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}

