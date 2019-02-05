import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file1 = new File("hangman.txt");
		if (file1.exists())
			System.out.println("hangman.txt exists");
		else
			System.out.println("doesnt exist");
		
		try
		{
			Scanner reader1 = new Scanner(file1);
			
			int numOfWords = 0;
			//String[] wordsArray = new String[numOfWords-1];
			ArrayList<String> wordsArrayList = new ArrayList<>();
			while (reader1.hasNext())
			{
				wordsArrayList.add(reader1.next());
				numOfWords++;
			}
			System.out.println("DEBUG: numOfWords: " + numOfWords);
			
			int counter = 0;
			String testWord = "";
			while (counter != numOfWords)
			{
				testWord = wordsArrayList.get(counter);
				//make scanner read from keyboard instead of from file 
				//by making a new scanner
				reader1 = new Scanner(System.in);
				guessInput(testWord, reader1);
				System.out.println("Do you want to guess another word?\nEnter y or n\t" +
						(numOfWords - counter) + " words left");
				char response = reader1.next().charAt(0);
				if (response == 'n')
				{
					System.out.println("ok, exited");
					break;
				}
					
				counter++;
			}
			reader1.close();
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			System.out.println("ioexception");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch (Exception ex)
		{
			System.out.println("caught");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static void guessInput(String testWordParam, Scanner reader1Param)
	{
		
		char[] testWordParamArray = testWordParam.toCharArray();
		char[] starArray = new char[testWordParam.length()];
		
		//make sure word is lower case
		for (int i = 0; i < testWordParamArray.length; i++)
		{
			if (Character.isUpperCase(testWordParamArray[i]))
				testWordParamArray[i] = Character.toLowerCase(testWordParamArray[i]);
		}
		System.out.println("\nDEBUG1\ntestWordParamArray[0] " + testWordParamArray[0]);
		//a is a local variable of the for each loop  so assigning doesn't effect the elements
		/*for (char a: starArray)
			a = '*';*/
		
		for (int i = 0; i < starArray.length; i++)
		{
			starArray[i] = '*';
		}
		System.out.println("\nDEBUG2");
		for (int i = 0; i < starArray.length; i++)
		{
			System.out.print(starArray[i] + " ");
		}
		System.out.println("\n\nDEBUG3");
		for (int i = 0; i < testWordParam.length(); i++)
		{
			System.out.print(testWordParamArray[i] + " ");
		}
		System.out.println("\nDEBUG4\nstarArray.length: " + starArray.length);
		int correct = 0;
		int wrong = 0;
		char guess;
		
		//System.out.println("\nDEBUG3\nreader1param has next? " + reader1Param.hasNext());
		while(correct != starArray.length)
		{
			System.out.println("\ninside while");
			System.out.println("guess letter in word: " + Arrays.toString(starArray)
			.replace(",","").replace("[", "").replaceAll("]",  "").replace(" ",""));
			//System.out.println("test input: enter 1 " + reader1Param.nextInt());
			//reader1Param = new Scanner(System.in);
			
				
				guess = reader1Param.next().charAt(0);
				for (int j = 0; j < starArray.length; j++)
				{
					if (guess == starArray[j])
					{
						System.out.println(guess + " is already in the word");
						break;
					}
					else if (guess == testWordParamArray[j])
					{
						for (int k = 0; k < starArray.length; k++)
						{
							if (guess == testWordParamArray[k])
							{
								starArray[k] = guess;
								correct++;
							}
						}
						break;
					}
					else if (guess != testWordParamArray[j] && j == starArray.length-1)
					{
						wrong++;
						System.out.println(guess + " is not a letter in the word");
					}
					else
						continue;
					
					//System.out.println("inside while's for wrong: " + wrong);
				}
				//System.out.println("inside while wrong: " + wrong);
		}	
		System.out.println("the word completed: " + Arrays.toString(starArray));
		System.out.println("actual word check: " + testWordParam);
		System.out.println("You missed: " + wrong);
	}

}
