import java.util.Scanner;
import java.util.ArrayList;
public class C11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enter 5 numbers
		//store them in array list
		//display their sum
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i ++)
		{
			list.add(input.nextDouble());
		}
		
		System.out.println("sum: " + sum(list));
		
		
	}
	//return sum of all numbers in an arraylist
	public static double sum(ArrayList<Double> list)
	{
		double sum = 0;
		for (int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}

}
