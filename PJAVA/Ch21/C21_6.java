import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class C21_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> numberOccurences = new HashMap<>();
		
		//read unspecified number of integers
		//input ends when input is 0
		Scanner input = new Scanner(System.in);
		int userInput;
		System.out.println("enter integers, 0 to end");
		int count = 1;
		while ( (userInput = input.nextInt()) != 0)
		{
			if (!numberOccurences.containsKey(userInput))
				numberOccurences.put(userInput, 1);
			else
			{
				Integer value = numberOccurences.get(userInput);
				numberOccurences.put(userInput, value+1);
			}
		}
		System.out.println("the integers with the most values are...\n");
		//find integers that have the most occurences
		findMostOccurences(numberOccurences);
		
	}
	
	public static void findMostOccurences(HashMap<Integer, Integer> numberOccurencesP)
	{
		int maxValue = Collections.max(numberOccurencesP.values());
		HashMap<Integer, Integer> highestOccurences = new HashMap<>();
		numberOccurencesP.forEach((key, value) -> 
		{
			if (value == maxValue)
				highestOccurences.put(key, value);
		});
		
		highestOccurences.forEach( (key, value) -> System.out.println("key: " + key + " value: " + value + "\n"));
	}

}
