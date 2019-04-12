import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class C21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			checkNumberOfFiles(args);
			
			//text file is passed using command line argument
			File file1 = new File(args[0]);
			System.out.println(file1.isFile());
			if (!file1.isFile())
			{
				System.out.println(file1);
				System.out.println(file1.isDirectory());
				System.out.println(file1.getAbsolutePath());
				System.out.println("file doesn't exist");
				System.exit(2);
			}
			else
			{
				System.out.println("found");
			}
			
			Set<String> set = readSetFile(file1);
			
			//display all nonduplicate words in ascending order, aka use treeset (no duplicates, sorting by ascending order)
			System.out.println(set);
			
		}
		
	//read words from text file
	public static Set<String> readSetFile(File file1)
	{
		Set<String> set1 = null;
		try (BufferedReader rdr1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1))))
		{
			String inputs;
			StringBuilder sb1 = new StringBuilder();
			while ((inputs = rdr1.readLine()) != null)
			{
				sb1.append(inputs);
			}
			String[] words = sb1.toString().split("\\s+");
			set1 = new TreeSet<>(Arrays.asList(words));
		}
		catch (IOException ex)
		{
			System.out.println("IOException");
			ex.printStackTrace();
		}
		return set1;
		
	}
	
	public static void checkNumberOfFiles(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("only need 1 file");
			System.exit(1);
		}
	}
	
	

}
