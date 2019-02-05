import java.io.*;
import java.util.*;
public class C12_16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (args.length != 3)
		{
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.println("source file " + args[0] + " does not exist");
			System.exit(2);
		}
		String s2 = "";
		try
		(
				Scanner scanner1 = new Scanner(sourceFile);
		)
		{
			System.out.println(scanner1.hasNextLine());
			while (scanner1.hasNextLine())
			{
				System.out.println("inside loop");
				String s1 = scanner1.nextLine();
				s2 = s1.replaceAll(args[1],  args[2]);
			}
			PrintWriter printer1 = new PrintWriter(sourceFile);
			System.out.println("outsideloop");
			printer1.write(s2);
			printer1.close();
		}
		/*String s2 = "";
		try 
		{
			Scanner scanner1 = new Scanner(sourceFile);
			while(scanner1.hasNextLine())
			{
				String s1 = scanner1.nextLine();
				s2 = s1.replaceAll(args[1], args[2]);
			}
			scanner1.close();
		} 
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		try
		{
			PrintWriter printer1 = new PrintWriter(sourceFile);
			printer1.write(s2);
			printer1.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}*/
				
		
	}

}


/*import java.io.*;
import java.util.*;
public class C12_16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (args.length != 4)
		{
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.println("source file " + args[0] + " does not exist");
			System.exit(2);
		}
		
		File targetFile = new File(args[1]);
		if (targetFile.exists())
		{
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(3);
		}
		try (
				Scanner input = new Scanner(sourceFile);
				PrintWriter output = new PrintWriter(targetFile);
			)
		{
			while (input.hasNext()) 
			{
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2],  args[3]);
				output.println(s2);
			}
		}
				
		
	}

}*/
