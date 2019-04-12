import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class C21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] array2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList(array1));
		Set<String> set2 = new LinkedHashSet<>(Arrays.asList(array2));
		
		//display to console
		findUnion(set1, set2);
		findDifference(set1, set2);
		findIntersection(set1,set2);
		
	}
	
	//no duplicates, contains all strings of both sets
	public static void findUnion(Set<String> s1, Set<String> s2)
	{
		Set<String> set1New = new LinkedHashSet<>();
		set1New.addAll(s1);
		set1New.addAll(s2);
		System.out.println("Union of set1 and set2 is:\n" + set1New);
		
	}
	
	//i guess array1 - array2 or A - B, which means includes strings that are only in a, if in a and b  then remove, if in b but not a then remove
	//i think just wats in a and not b , and whats in b and not a actually
	public static void findDifference(Set<String> s1, Set<String> s2)
	{
		Set<String> set1New = new LinkedHashSet<>();
		Set<String> set2New = new LinkedHashSet<>();
		set1New.addAll(s1);
		set2New.addAll(s2);
		set1New.removeAll(s2);
		set2New.removeAll(s1);
		set1New.addAll(set2New);
		System.out.println("Difference of set1 and set2 is:\n" + set1New);
	}
	
	//strings that are in both sets, if none empty set or null set?, no duplicates?
	public static void findIntersection(Set<String> s1, Set<String> s2)
	{
		Set<String> set1New = new LinkedHashSet<>();
		Set<String> set2New = new LinkedHashSet<>();
		set1New.addAll(s1);
		set2New.addAll(s2);
		set1New.retainAll(s2);
		System.out.println("Intersection of set1 and set2 is:\n" + set1New);
	}
	
	/*
	 * 
Set 1: [George, Jim, John, Blake, Kevin, Michael]
Set 2: [George, Katie, Kevin, Michelle, Ryan]

Union: [George, Jim, John, Blake, Kevin, Michael, Katie, Michelle, Ryan]

Difference: [Jim, John, Blake, Michael, Katie, Michelle, Ryan]

Intersection: [George, Kevin]


	 */

}
