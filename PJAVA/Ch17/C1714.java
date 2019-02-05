import java.io.*;
import java.util.Scanner;
public class C1714 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		System.out.println('a' + 5);

		Scanner input = new Scanner(System.in);
		System.out.println("enter an input file name");
		String inputFile = input.next();
		System.out.println("Enter output file name");
		String outputFile = input.next();
		
		File file1 = new File(inputFile +".txt");
		File file2 = new File(outputFile + ".txt");
		
		
		if (!file1.exists() && !file2.exists())
		{
			System.out.println("file1 or file2 doesn't exist");
			file1.createNewFile();
			file2.createNewFile();
		}
		
		
		System.out.println("enter wat u want: ");
		String str = "";
		int count = 0;
		while (count != 5)
		{
			str += input.next() + " ";
			System.out.println(str);
			count++;
		}
		
		try (DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1))))
		{
			out1.writeChars(str);
		}
		
		encodeFiles(file1, file2);
		System.out.println("done");
	}
		

	
	public static void encodeFiles(File file1P, File file2P) throws IOException
	{
		System.out.println("encodeFiles: ");
		try (DataInputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1P)));
				DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file2P))))
		{
			System.out.println("1");
			try
			{
				System.out.println("2");
				int a;
				while ((a = in2.read()) != -1)
				{
					System.out.println("insideloop");
					out2.write(a+5);
				}
			}
			catch(EOFException ex)
			{
				System.out.println("EOF");
			}
		}
	}

}























