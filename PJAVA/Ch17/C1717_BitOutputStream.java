import java.io.*;
public class C1717_BitOutputStream {
	
	private static byte var1;
	
	public C1717_BitOutputStream(File file1)
	{
		
		if (!file1.exists())
		{
			System.out.println("C1717_a.txt doesn't exist");
			System.exit(1);
		}
			
		try (FileOutputStream out1 = new FileOutputStream(file1))
		{
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("FNFE");
		}
		catch (IOException ex)
		{
			System.out.println("IO Exception");
		}
	}
	
	public static void writeBit(char bit)
	{
		var1 = (byte) bit;
	}
	
	public static void writeBit(String bit)
	{
		
	}
}
