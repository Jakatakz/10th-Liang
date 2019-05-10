import java.util.*;
public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");
		
		ArrayList<String> collection2 = new ArrayList<>();
		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angeles");
		collection2.add("Atlanta");
		
		ArrayList<String> c1 = 
				(ArrayList<String>)(collection1.clone());
		
		System.out.println(c1);
		System.out.println();
		c1 = (ArrayList<String>)(collection1.clone());
		c1.removeAll(collection2);
		System.out.println("cities in collection1, but no in 2");
		System.out.println(c1);
	}

}
