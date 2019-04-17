import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
public class C21_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse arraylist , i couldve just done Collections.reverse()  since arrays are part of the collections framework
		for (int i = 0; i < stateCapitals.length; i++)
		{
				String temp = stateCapitals[i][1];
				stateCapitals[i][1] = stateCapitals[i][0];
				stateCapitals[i][0] = temp;
		}
		//checking reverse worked
		/*
		 * for (int i = 0; i < stateCapitals.length; i++) {
		 * System.out.println(stateCapitals[i][0] + ", " + stateCapitals[i][1]); }
		 */
		
		//store pairs of state and capital in a map
		Map<String, String> map1 = new TreeMap<>();
		storeStateCapitals(map1, stateCapitals);
		
		//get a random state
		Random rnd1 = new Random();
		int randomInt = rnd1.nextInt(stateCapitals.length);	
		String randomState = stateCapitals[randomInt][1];
		String clue = stateCapitals[randomInt][0];
		System.out.println("randomState: " + randomState);
		
		
		//prompt user to guess capital of a state
		System.out.println(clue + "\n" + "Guess the capital of " + randomState);
		Scanner input = new Scanner(System.in);
		String state = "ooo";
		boolean chk = true;
		while(chk)
		{
			if (input.hasNext("^[A-Za-z]+$"))
			{
					state = input.next();
					chk = false;
					System.out.println("exiting");
			}
			else
			{
				System.out.println("not a state, try again, or 0 to close");
				input.nextLine();
			}
		}
		System.out.println("here");
		System.out.println(map1.get(state));
		System.out.println(stateCapitals[randomInt][0]);
		displayCapitalForState(map1, stateCapitals, state, randomInt);
		
		//used to check how it looks in map
		map1.forEach((key, value) -> System.out.println(key + ", " + value));
		
	}
	
	public static void displayCapitalForState(Map<String, String> aMap1, String[][] aStateCapitals, String aState, int aRandomInt)
	{
		//display the capital for the state
		if (aMap1.get(aState) != null && aMap1.get(aState).equalsIgnoreCase(aStateCapitals[aRandomInt][1]))
			System.out.println("Correct, " + aState + " is the capital of " + aMap1.get(aState));
		else
			System.out.println("wrong, " + aState + " is not the capital of " + aMap1.get(aState));
	}
	
	
	public static void storeStateCapitals(Map<String, String> aMap1, String[][] aStateCapitals)
	{
		List<String[]> list1 = Arrays.asList(aStateCapitals);
		list1.forEach((a) -> aMap1.put(a[0], a[1]));
		
	}
	
	 private static String[][] stateCapitals = {
	            {"Alabama", "Montgomery"},
	            {"Alaska", "Juneau"},
	            {"Arizona", "Phoenix"},
	            {"Arkansas", "Little Rock"},
	            {"California", "Sacramento"},
	            {"Colorado", "Denver"},
	            {"Connecticut", "Hartford"},
	            {"Delaware", "Dover"},
	            {"Florida", "Tallahassee"},
	            {"Georgia", "Atlanta"},
	            {"Hawaii", "Honolulu"},
	            {"Idaho", "Boise"},
	            {"Illinois", "Springfield"},
	            {"Maryland", "Annapolis"},
	            {"Minnesota", "Saint Paul"},
	            {"Iowa", "Des Moines"},
	            {"Maine", "Augusta"},
	            {"Kentucky", "Frankfort"},
	            {"Indiana", "Indianapolis"},
	            {"Kansas", "Topeka"},
	            {"Louisiana", "Baton Rouge"},
	            {"Oregon", "Salem"},
	            {"Oklahoma", "Oklahoma City"},
	            {"Ohio", "Columbus"},
	            {"North Dakota", "Bismark"},
	            {"New York", "Albany"},
	            {"New Mexico", "Santa Fe"},
	            {"New Jersey", "Trenton"},
	            {"New Hampshire", "Concord"},
	            {"Nevada", "Carson City"},
	            {"Nebraska", "Lincoln"},
	            {"Montana", "Helena"},
	            {"North Carolina", "Raleigh"},
	            {"Missouri", "Jefferson City"},
	            {"Mississippi", "Jackson"},
	            {"Massachusetts", "Boston"},
	            {"Michigan", "Lansing"},
	            {"Pennsylvania", "Harrisburg"},
	            {"Rhode Island", "Providence"},
	            {"South Carolina", "Columbia"},
	            {"South Dakota", "Pierre"},
	            {"Tennessee", "Nashville"},
	            {"Texas", "Austin"},
	            {"Utah", "Salt Lake City"},
	            {"Vermont", "Montpelier"},
	            {"Virginia", "Richmond"},
	            {"Washington", "Olympia"},
	            {"West Virginia", "Charleston"},
	            {"Wisconsin", "Madison"},
	            {"Wyoming", "Cheyenne"}
	    };

}
