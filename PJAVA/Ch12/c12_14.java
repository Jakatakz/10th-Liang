import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class c12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*if (args.length != 1)
		{
			System.out.println("args error");
			System.exit(1);
		}*/
		
		try
		{
			File c12_14_file = new File("c12_14_text.txt");
			if (c12_14_file.exists())
				System.out.println("c12_14_file exists");
			else
				System.out.println("c12_14_file doesn't exist");
				
			Random randomNum = new Random();
			int n = randomNum.nextInt(10);
			int[] arrayText = new int[n];
			
			for (int i = 0; i < arrayText.length; i++)
			{
				arrayText[i] = randomNum.nextInt(100);
			}
			
			PrintWriter writer1 = new PrintWriter(c12_14_file);
			for (int i = 0; i < arrayText.length; i++)
			{
				writer1.write(arrayText[i] + " ");
			}
			//writer1.write(arrayText.toString());
			writer1.close();
			
			Scanner reader1 = new Scanner(c12_14_file);
			int sum = 0;
			int counter = 0;
			while (reader1.hasNext())
			{
				sum += reader1.nextInt();
				counter++;
			}
			double average = sum / counter;
			
			System.out.println("total: " + sum);
			System.out.println("average: " + average);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		
	}

}
