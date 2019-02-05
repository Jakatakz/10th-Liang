import java.util.Scanner;
import java.io.*;
public class C1716 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("prompt user to enter name of ascii text file");
		String fileName1 = keyboard1.next();
		keyboard1.close();
		
		File file1 = new File(fileName1);
		
		if (!file1.exists())
		{
			System.out.println("file doesn't exist");
			System.exit(1);
		}
		
		
		//display frequency of chars in the file.
		char[] ABCArray = getABCArray();
		displayABCCount(file1, ABCArray);
	}
	
	public static void displayABCCount(File file1Param, char[] ABCArrayParam) throws FileNotFoundException
	{
		int count = 0;
		int[] countABC = getCountABC(file1Param, ABCArrayParam);
		for (int i = 0; i < ABCArrayParam.length; i++)
			{
				
				if (count % 10 == 0)
					System.out.println();
				
					System.out.print(ABCArrayParam[i] + ": " + countABC[i] + " ");
					count++;
		
			}
	}
	
	public static int[] getCountABC(File file1Param, char[] ABCArrayParam) throws FileNotFoundException
	{
		Scanner keyboard2 = new Scanner(file1Param);
		int[] countABCArray = new int[26];
		
		int i = 0;
		while (keyboard2.hasNextLine())
		{
			String word = keyboard2.nextLine();
			System.out.println("word: >" + word + "<");
			int lengthOfWord = word.length();
			System.out.println("lengthOfWord: " + lengthOfWord);
			
			for (int k = 0; k < ABCArrayParam.length; k++)
			{
				for (int z = 0; z < lengthOfWord; z++)
				{ 
					if (word.charAt(z) >= 97 && word.charAt(z) <= 122 && ABCArrayParam[k] == word.charAt(z))
					{
						System.out.println(ABCArrayParam[k] + " ---- " + word.charAt(z));
						countABCArray[k]++;
						//System.out.print(countABCArray[k]+ " ");
					}
				}
				
			}
				
		}
		keyboard2.close();
		System.out.println("getCountABC return");
		return countABCArray;
		
		
		
	}
	
	public static char[] getABCArray()
	{
		char[] array = new char[26];
		System.out.println("length of char array: " + array.length);
		char letter = 'a';
		for (int i = 0; i < array.length; i++)
		{
			array[i] = letter;
			letter++;
		}
		System.out.println("getABCArray return");
		return array;
	}

}
