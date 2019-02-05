import java.io.*;
import java.util.Scanner;
public class C1710 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//737,280,000 bytes
		if (args.length != 2)
		{
			System.out.println("args error");
			System.exit(1);
		}
		
		//source file
		File file1 = new File(args[0]);
		
		if (!file1.exists())
		{
			System.out.println("file1 doesn't exist");
			System.exit(2);
		}
		
		if (!file1.isFile())
		{
			System.out.println(args[0] + " is not a file");
			System.exit(3);
		}
		if (file1.length() == 0)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("enter how many stuff in file  u want");
			int stuff = input.nextInt();
			try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1))))
			{
				for (int i = 0; i < stuff; i++)
					out.write('a');
			}
		}
		
		int pieces = Integer.parseInt(args[1]);
		System.out.println("pieces: " + pieces);
		long limit =  (file1.length() / (pieces + 1L));
		
		System.out.println("limit: " + limit);
		
		try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
		{
			System.out.println("read in1");
			for (int i = 1; i <= pieces; i++)
			{
				int current = 0;
				try (DataOutputStream out1 
						= new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(i + args[0])))))
				{
					int readchk;
					while (current < limit && (readchk = in1.read()) != -1)
					{
						out1.write(readchk);
						current++;
					}
				}
			}
			System.out.println("end readin1");
			
		}

	}

}
