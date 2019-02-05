import java.io.*;

public class c12_11p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(args.length);
		//System.out.println(args[0] + " " + args[1]);
		//java Exercise12_11 John filename
		//John c12_11p2.txt
		if (args.length !=  2)
		{
			System.out.println("argument doesn't exist");
			System.exit(1);
		}
		
		String removeStr = args[0];
		String str = "";
		
		try
		{
			
			//setup to remove
			File file5 = new File(args[1]);
			if (file5.exists())
				System.out.println("file5 already exists");
			else
				System.out.println("file5 doesn't exist");
			
			PrintWriter printer5 = new PrintWriter(file5);
			str = "John John One John Two John Three Four Five John";
			printer5.write(str);
			printer5.close();
			
			//remove John
			//target file "c12_11p2_new.txt
			//str = str.replace("John", "").trim();
			str = str.replace(args[0], "").trim();
			//str = str.trim();
			//System.out.println(str);
			File file10 = new File("c12_11p2_new.txt");
			if (file10.exists())
				System.out.println("file10 already exists");
			else
				System.out.println("file 10 doesn't exist");
			
			PrintWriter printer10 = new PrintWriter(file10);
			printer10.write(str);
			printer10.close();
			
			
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
