import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C20_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//randomly create 100 points
		//apply Arrays.sort method to display the points in increasing order of their x coordinates and y coordinates respectively.
		
		C20_4_Point[] list1 = new C20_4_Point[100];
		for (int i = 0; i < 100; i++)
		{
			list1[i] = new C20_4_Point();
			list1[i].x = Math.random() * 100;
			list1[i].y = Math.random() * 100;
		}

		//sort by x priority
		System.out.println("x priority");
		Arrays.sort(list1);
		for (C20_4_Point a: list1)
		{
			System.out.println(a.toString());
		}
		
		//sort by y priority
		System.out.println("y priority");
		Arrays.sort(list1, new C20_4_CompareY());
		for (C20_4_Point a: list1)
		{
			System.out.println(a.toString());
		}
	}

}
