import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C20_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C20_6_Stopwatch stopwatch1 = new C20_6_Stopwatch();
		
		//store 5 mil integers in linked list
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new ArrayList<>();
		List<String> list3 = new LinkedList<>();
		for (int i = 0; i < 100000; i++)
		{
			list1.add(i);
			list2.add(i);
			list3.add("did");
		}
		
		//list1 linkedlist iterator
		stopwatch1.start();
		//traverse list using iterator
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext())
		{
			itr1.next();
		}
		
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
		stopwatch1.reset();
		
		//list1 linkedlist get
		stopwatch1.start();
		//traverse list using get(index) method
		for (int i = 0; i < list1.size(); i ++)
		{
			list1.get(i);
		}
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
		stopwatch1.reset();
		
		//list2 arraylist iterator
		stopwatch1.start();
		Iterator<Integer> itr2 = list2.iterator();
		while (itr2.hasNext())
		{
			itr2.next();
		}
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
		stopwatch1.reset();
		
		//list2 arraylist get
		stopwatch1.start();
		for (int i = 0; i < list2.size(); i ++)
		{
			list2.get(i);
		}
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
		stopwatch1.reset();
		
		//linkedlist string iterator
		System.out.println("string + linkedlist iterator");
		stopwatch1.start();
		//traverse list using iterator
		Iterator<String> itr3 = list3.iterator();
		while(itr3.hasNext())
		{
			itr3.next();
		}
		
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
		stopwatch1.reset();
		
		System.out.println("string linkedlist get");
		//linkedlist string get
		stopwatch1.start();
		//traverse list using get(index) method
		for (int i = 0; i < list3.size(); i ++)
		{
			list3.get(i);
		}
		stopwatch1.stop();
		System.out.println("elapsed time: " + stopwatch1.getElapsedTime());
		System.out.println(stopwatch1.toString());
	}

}
