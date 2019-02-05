import java.io.*;
import java.util.Scanner;
public class C188 {

	static int value2;
	public static void main(String[] args) throws FileNotFoundException, IOException, EOFException {
		// TODO Auto-generated method stub

		File file1 = new File("C188.txt");
		/*if (!file1.exists())
		{
			System.out.println("file doesn't exist, creating...");
			file1.createNewFile();
		}*/
		if (file1.createNewFile())
		{
			System.out.println("returned true, created new file");
		}
		else
			System.out.println("file already exists");
		
		System.out.println("Enter numbers");
		Scanner input = new Scanner(System.in);
		int nums = input.nextInt();
		
		try (DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1))))
		{
			System.out.println("nums: " + nums);
			out1.writeInt(nums);
			
		}
		
		try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
		{
			
			System.out.println("read from file:");
			int k;
			String value1 = "";
			while ( in1.available() > 0)
			{
				k = in1.readInt();
				value1 += k;
			}
			
			System.out.println("value1: " + value1);
			value2 = Integer.parseInt(value1);
		}
		System.out.println(value2);
		reverseDisplay(value2);
		
		
		
	}
	
	public static void reverseDisplay(int value)
	{
		
		if (value <= 0)
			return;
		System.out.print(value % 10);
		reverseDisplay(value / 10);
		
	}

}
