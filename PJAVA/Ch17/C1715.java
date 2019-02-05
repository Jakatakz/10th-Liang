import java.io.*;
import java.util.Scanner;
public class C1715 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		char letter = 'a';
		System.out.println("letter: " + letter);
		System.out.println("after ++ : " + ++letter);
		System.out.println('a' + 5);

		Scanner input = new Scanner(System.in);
		System.out.println("enter an input file name");
		String inputFile = input.next();
		System.out.println("Enter output file name");
		String outputFile = input.next();
		System.out.println("Enter decoded file name: ");
		String decodedFile = input.next();
		
		File sourceFile = new File(inputFile +".txt");
		File targetFileEncode = new File(outputFile + ".txt");
		File targetFileDecode = new File(decodedFile + ".txt");
		
		
		if (!sourceFile.exists() && !targetFileEncode.exists() && !targetFileDecode.exists())
		{
			System.out.println("file1, file2 or file3 doesn't exist");
			sourceFile.createNewFile();
			targetFileEncode.createNewFile();
			targetFileDecode.createNewFile();
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
		
		try (DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(sourceFile))))
		{
			out1.writeChars(str);
		}
		
		encodeFiles(sourceFile, targetFileEncode);
		decodeFiles(targetFileEncode, targetFileDecode);
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
					//System.out.println("insideloop");
					out2.write(a+5);
				}
			}
			catch(EOFException ex)
			{
				System.out.println("EOF");
			}
		}
	}
	
	public static void decodeFiles(File targetFileEncodeParam, File targetFileDecodeParam) throws IOException
	{
		System.out.println("decodeFiles");
		try (BufferedInputStream in1 = new BufferedInputStream(new FileInputStream(targetFileEncodeParam));
				BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(targetFileDecodeParam)))
						{
							int a;
							while ( (a = in1.read()) != -1)
							{
								out1.write(a-5);
							}
						}
	}

}

