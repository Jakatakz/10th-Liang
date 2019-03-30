import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.List;
import java.lang.NumberFormatException;
public class C20_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String[]> list1 = new ArrayList<>();
		Collections.addAll(list1, getStatesCapitalsArray());
		Collections.shuffle(list1);
		askQuestionAndAnswer(list1);
		
		System.out.println("Are states and capitals displayed randomly check");
		for (String[] a: list1)
			System.out.println(a[0] + ", " + a[1]);
		
	}

	public static void askQuestionAndAnswer(List<String[]> list1)
	{
		//prompt user to enter capital for a state, questions should be displayed randomly, users answer is not case sensitive
		//upon receiving user input, report whether user is correct
		boolean chkr = false;
		Random rnd1 = new Random();
		int randomGetter = rnd1.nextInt(50)+1;
		Scanner input = new Scanner(System.in);
		do
		{
				System.out.println("What is the capital for: " + list1.get(randomGetter)[0]);
				String answer = input.next();
				if (answer.matches("\\p{L}+"))
				{
					if (answer.equalsIgnoreCase(list1.get(randomGetter)[1]))
						chkr=true;
				}
			System.out.println("here");
			//input.nextLine();
		} while(chkr == false);
		input.close();
	}
	
	private static String[][] getStatesCapitalsArray()
	{
		String[][] arraySC = {
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
		return arraySC;
	}
	
	
	//assume 50 states and their capitals are stored in a 2d  array (collection for ch 20)
	/*
	 * private static String getStatesCapitalsArray(int x, int y) { String[][]
	 * arraySC = { {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona",
	 * "Phoenix"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
	 * {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"},
	 * {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"},
	 * {"Idaho", "Boise"}, {"Illinois", "Springfield"}, {"Maryland", "Annapolis"},
	 * {"Minnesota", "Saint Paul"}, {"Iowa", "Des Moines"}, {"Maine", "Augusta"},
	 * {"Kentucky", "Frankfort"}, {"Indiana", "Indianapolis"}, {"Kansas", "Topeka"},
	 * {"Louisiana", "Baton Rouge"}, {"Oregon", "Salem"}, {"Oklahoma",
	 * "Oklahoma City"}, {"Ohio", "Columbus"}, {"North Dakota", "Bismark"},
	 * {"New York", "Albany"}, {"New Mexico", "Santa Fe"}, {"New Jersey",
	 * "Trenton"}, {"New Hampshire", "Concord"}, {"Nevada", "Carson City"},
	 * {"Nebraska", "Lincoln"}, {"Montana", "Helena"}, {"North Carolina",
	 * "Raleigh"}, {"Missouri", "Jefferson City"}, {"Mississippi", "Jackson"},
	 * {"Massachusetts", "Boston"}, {"Michigan", "Lansing"}, {"Pennsylvania",
	 * "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina",
	 * "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
	 * {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
	 * {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia",
	 * "Charleston"}, {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"} };
	 * 
	 * return arraySC[x][y];
	 * 
	 * }
	 */
	
	//display the total correct count
}

