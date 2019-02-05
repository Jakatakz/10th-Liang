import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Random;



/*
 * WORKS WITH NOTEPAD++ PROBABLY DUE TO ENCODING SCHEME BEING WRONG FOR NOTEPAD
 */
public class c171 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file171 = new File("Exercise17_01.txt");

		if (file171.exists())
		{
			System.out.println("file already exists...appending new data");
			//append new data
		}
		else
			System.out.println("new file");
		
		try 
		{
			writeIntegersToFile(file171);
			//deleteContents(file171);
		}
		catch (UnsupportedEncodingException ex)
		{
			ex.printStackTrace();
			System.out.println("caught 1");
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
			System.out.println("caught 2");
		}
		
		
	}
	
	public static void writeIntegersToFile(File file171) throws FileNotFoundException, UnsupportedEncodingException
	{
		try (PrintWriter writer1 = new PrintWriter( new BufferedOutputStream(new FileOutputStream(file171, true)) ))
		{
			Random rnd1 = new Random();
			for (int i = 0; i < 100; i++)
				{
					writer1.print((rnd1.nextInt(9)) + " ");
					//writer1.print(" ");
				}
		}
	}
	
	public static void deleteContents(File file171) throws FileNotFoundException 
	{
		try(PrintWriter writer2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file171))))
		{
		writer2.print("");
		}
	}

}
