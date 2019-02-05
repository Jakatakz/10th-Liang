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

public class C172 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_92.dat");
		//File fileRead1 = new File ("Exercise17_02.txt");
		
		if (file1.exists())
			System.out.println("already exists");
		else
			System.out.println("created...");
		
		
		//false here makes it so you don't append more data to the file.
		try ( DataOutputStream out1 = 
				new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1, false))))
		{
			Random rnd1 = new Random();
			int counter = 0;
			while (counter != 100)
			{
				int i = rnd1.nextInt(10);
				out1.write(i);
				counter++;

			}
			
		}
		
		try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
		{
			int value;
			int readerCounter = 0;
			
			while ((value = in1.read()) != -1)
			{
				System.out.println(value + " ");
				readerCounter++;
			}
			System.out.println("readerCounter: " + readerCounter);
		}
		
	}

}
