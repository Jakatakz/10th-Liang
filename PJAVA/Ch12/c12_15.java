import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class c12_15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try
		{
		File Exercise12_15_file = new File("Exercise12_15.txt");
		if (Exercise12_15_file.exists())
			System.out.println("exercise12_15_file exists");
		else
			System.out.println("exercise12_15_file doesn't exist");
		Random random1 = new Random();
		int[] intArray1 = new int[100];
		int counter = 0;
		PrintWriter writer1 = new PrintWriter(Exercise12_15_file);
		for (int i = 0; i < intArray1.length; i ++)
		{
			intArray1[i] = random1.nextInt(100);
			if (i % 10 == 0)
				writer1.write("\r\n"  + intArray1[i] + " ");
			else
				writer1.write(intArray1[i] + " ");
			counter++;
		}
		writer1.close();
		
		Scanner reader1 = new Scanner(Exercise12_15_file);
		ArrayList<Integer> list1 = new ArrayList<>();
		while(reader1.hasNext())
		{
			list1.add(reader1.nextInt());
		}
		Collections.sort(list1);
		for (int i = 0 ; i < list1.size(); i++)
		{
			if (i % 10 == 0 && i != 0)
				System.out.println(list1.get(i) + " ");
			else
				System.out.print(list1.get(i) + " ");
		}
		reader1.close();
		
		
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
