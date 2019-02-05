import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class C12_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//total salary for assistant
		//total salary for associate
		//total salary for full
		//total for all
		
		
		//average salary for assistant
		//average salary for associate
		//average salary for full
		//average salary for all
		File file1 = new File("Salary.txt");
		if (!file1.exists())
		{
			System.out.println("file1 doesn't exist, aborting");
			System.exit(1);
		}
		else
			System.out.println("file1 exists");
		
		//Scanner reader1 = new Scanner("Salary.txt");
		try
		{
		Scanner reader1 = new Scanner(file1);
		
		int assistantCount = 0;
		int assistantSum = 0;
		int associateCount = 0;
		int associateSum = 0;
		int fullCount = 0;
		int fullSum = 0;
		String name;
		while(reader1.hasNext())
		{
			name = reader1.next();
			//System.out.println("name: " + name);
			if (name.equals("assistant"))
			{
				assistantCount++;
				assistantSum += reader1.nextInt();
			}
			else if (name.equals("associate"))
			{
				associateCount++;
				associateSum += reader1.nextInt();
			}
			else if (name.equals("full"))
			{
				fullCount++;
				fullSum += reader1.nextInt();
			}
			else 
			{
				//reader1.nextLine();
				continue;
			}
		}
		reader1.close();
		
		System.out.println("total salary for assistant: " + assistantSum 
				+ "\ncount " + assistantCount);
		System.out.println("total salary for associate: " + associateSum 
				+ "\ncount " + associateCount);
		System.out.println("total salary for full: " + fullSum 
				+ "\ncount " + fullCount);
		System.out.println("total for all: " + (assistantSum + associateSum + fullSum));
		
		System.out.println("average salary for assitant: " + (assistantSum/assistantCount));
		System.out.println("average salary for associate: " + (associateSum/associateCount));
		System.out.println("average salary for full: " + (fullSum/fullCount));
		System.out.println("average salary for all: " + (assistantSum + associateSum + fullSum) / 1000);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

	
}
