import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C21_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fileName = promptUserFileName();
		File file1 = new File(fileName);
		if (file1.isFile())
			displayVowelsConsonants(file1);
		else
			System.out.println("Not a file");
	}

	//prompt user to enter text file name
	public static String promptUserFileName()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text file name: " );
		String textFileName = input.next();
		return textFileName;
	}
	
	//display the number of vowels and consonants in the file
	public static void displayVowelsConsonants(File file1P)
	{
		//use a set to store the vowels A, E, I, O, U.
		try (BufferedReader rdr1 = new BufferedReader(new FileReader(file1P)))
		{
			int vowels = 0;
			int consonant = 0;
			//read from file and store vowels
			HashSet<Character> set1 = new HashSet<>(Arrays.asList(new Character[] {'A', 'E', 'I', 'O', 'U'}));
			System.out.println(set1);
			int c;
			while ( (c = rdr1.read()) != -1)
			{
				char letter = (char)c;
				System.out.print(letter);
				letter = Character.toUpperCase(letter);
				if (set1.contains(letter))
					vowels++;
				else 
					consonant++;
				//System.out.print(vowels + " ");
			}
			System.out.println("\nFile: " + file1P + "\nVowels: " + vowels +"\nConsonants: " + consonant);
		} catch (FileNotFoundException e)
		{
			System.out.println("fnf");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("io");
			e.printStackTrace();
		}
		
	}
	
	
}
