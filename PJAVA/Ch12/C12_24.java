import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class C12_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File largeDataSetFile = new File("Salary.txt");
		if(!largeDataSetFile.exists())
		{
			System.out.println("file doesn't exists, exiting");
			System.exit(1);
		}
		Random rand1 = new Random();
		
		try
		{
			PrintWriter printer1 = new PrintWriter(largeDataSetFile);
			for (int i = 1 ; i < 1001; i++)
			{
				String rank = generateRank(i, rand1);
				int salary = generateSalary(i, rand1, rank);
				printer1.write(generateFirstName(i) + " " + generateLastName(i)
					+ " " + rank + " " + salary + "\r\n");
			}
			printer1.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("FileNotFound exception");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	private static String generateFirstName(int i_prm)
	{
		return "FirstName" + i_prm;
	}
	
	private static String generateLastName(int i_prm)
	{
		return "LastName" +  i_prm;
	}
	
	//randomly generated
	private static String generateRank(int i_prm, Random rand1_prm)
	{
		int rankNum = rand1_prm.nextInt(3);
		String rank = "";
		if (rankNum == 0)
			rank = "assistant";
		else if (rankNum == 1)
			rank = "associate";
		else
			rank = "full";
		
		return rank;
	}
	
	//randomly generated
	private static int generateSalary(int i_prm, Random rand1_prm, String rank_prm)
	{
		int salary = 0;
		if (rank_prm.equals("assistant"))
			salary = rand1_prm.nextInt(80000-50000)+50000;
		else if (rank_prm.equals("associate"))
			salary = rand1_prm.nextInt(110000-60000)+60000;
		else
			salary = rand1_prm.nextInt(130000-75000)+75000;
		
		return salary;
	}

}
