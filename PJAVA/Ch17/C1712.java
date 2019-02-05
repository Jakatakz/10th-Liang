import java.io.*;

public class C1712 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		// TODO Auto-generated method stub

		if (args.length < 3)
		{
			System.out.println("need at least 3 args");
			System.exit(1);
		}
		System.out.println(args[args.length-1]);
		
		File targetFile = new File(args[args.length-1]);
		targetFile.createNewFile();
		if (!targetFile.exists())
		{
			System.out.println("targetfile doesn't exist");
			System.exit(2);
		}
		try (DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(targetFile))))
		{
			for (int i = 0; i < args.length-1; i++)
			{
				try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(args[i]))))
				{
					System.out.println(args[i]);
						int rdchk;
						while ((rdchk = in1.read()) != -1)
						{
							out1.write(rdchk);
						}
					
				}
			}
		}
	}

}
