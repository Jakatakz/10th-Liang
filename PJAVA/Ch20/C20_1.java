import java.io.*;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * 
 (Display words in ascending alphabetical order) Write a program that reads
words from a text file and displays all the words (duplicates allowed) in ascending
alphabetical order. The words must start with a letter. The text file is passed
as a command-line argument.
 */


public class C20_1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub

		File file1 = new File(args[0]);
		if (file1.exists())
		{
			System.out.println("file1 already exists");
			System.exit(2);
		}
		
		
		//text file is passed as a command-line argument
		if (args.length != 1)
		{
			System.out.println("args error");
			System.exit(1);
		}
		
		writeToFile(file1);
		PriorityQueue<String> q1 = new PriorityQueue<>();
		readFromFile(file1, q1);
		while (!q1.isEmpty())
		{
			System.out.print(q1.poll() + " ");
		}
		file1.delete();
	}

			//write words to a text file
			public static void writeToFile(File file1) throws FileNotFoundException, IOException
			{
				boolean tryChk = true;
				int numWords;
				Scanner input = new Scanner(System.in);
				do
				{
					try (
						DataOutputStream out1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file1)));
						)
					{
						System.out.println("Enter # of words you want: ");
						numWords = input.nextInt();
						tryChk=false;
						for (int i = 0; i < numWords; i++)
						{
							out1.writeUTF(input.next());
						}
					}
					catch(InputMismatchException | NumberFormatException ex)
					{
						System.out.println("incorrect input, try again");
						input.next();
					}
				}
				while (tryChk);
			
			}
			
			//read words from text file
			//displays all the words (dups allowed) in ascending alphabetical order
			//must start with letter
			public static void readFromFile(File file1, PriorityQueue q1) throws FileNotFoundException, IOException
			{
				try (DataInputStream in1 = new DataInputStream(new BufferedInputStream(new FileInputStream(file1))))
				{
					String a;
					while ((a = in1.readUTF()) != null)
					{
						a = fixWords(a);
						q1.add(a);
					}
				}
				catch (EOFException ex)
				{
					System.out.println("eof handled.");
				}
			}
	
			//must start with letter
			public static String fixWords(String a)
			{
				a = a.replaceAll("[0-9]+\\p{L}+", "");	//any word starting with num is replaced
				a = a.replaceAll("\\s+", " "); 	//remove extra whitespace
				//could split if i was entering a sentence for example, to split words using string split aka a.split(" ");
				return a;
			}

}
