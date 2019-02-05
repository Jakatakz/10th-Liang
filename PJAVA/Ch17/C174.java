import java.io.*;
public class C174 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub

	
		File file1 = new File(args[0]);
		
		
		if (file1.isFile())
		{
			System.out.println(file1.getAbsolutePath());
			System.out.println("file1 already exists, overwriting");
		}
		else if (!file1.isFile())
		{
			System.out.println(file1.getAbsolutePath());
			System.out.println("file doesnt exist");
			System.exit(1);
		}
		else
			System.out.println("creating...");
		
		/*if (args.length != 2)
			System.exit(0);*/
		
		try (BufferedReader in1 = new BufferedReader(new FileReader(file1));
			 DataOutputStream out1 =
					 new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(args[1]))))
			)
		{
			String lineStr;
			int fileSize = 0;
			while ((lineStr = in1.readLine()) != null)
			{
				out1.writeUTF(lineStr);
				fileSize += lineStr.length();
			}
			System.out.println("size of the text file: " + fileSize + " characters/bytes?");
			System.out.println("size of the byte file " + args[1] + " is: " + out1.size() + " bytes");
		}
		
		try (
				InputStream input1 = new FileInputStream(args[0]);
				InputStream input2 = new FileInputStream(args[1]);
			)
		{
			System.out.println(args[0] + " 's size is " + input1.available() + " bytes");
			System.out.println(args[1] + " 's size is " + input2.available() + " bytes");
		}
		
	}

}
