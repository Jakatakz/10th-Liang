import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class C173 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_03.dat");
		checkFileExists(file1);
		
		Random r1 = new Random();
		Random r2 = new Random();
		//int value = 0;
		int numberOfIntegers = r1.nextInt(20);
		int counter = 0;
		int sum = 0;
		int num;
		System.out.println("numberOfIntegers: " + numberOfIntegers);
		
		try (DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1))))
		{
			while (counter != numberOfIntegers)
			{
				num = r2.nextInt(10);
				//sum += num;
				out1.writeInt(num);
				//System.out.println(num);
				counter++;
			}
			//System.out.println("the sum: " + sum);
			
		}
		
		try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
		{
			int numberOfIntegersReadable = in1.available()/4;
			int count = 0;
			int tempChecker;
			while( count != numberOfIntegersReadable )
			{
				tempChecker = in1.readInt();
				System.out.print(tempChecker + " ");
				sum += tempChecker;
				count++;
			}
		}
		System.out.println("sum: " + sum);
		
	}
	
	public static void checkFileExists(File file1_param)
	{
		if (file1_param.exists())
			System.out.println("already exists");
		else
			System.out.println("created...");
	}

}
