import java.util.Scanner;
public class C1813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] a = new int[8];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = input.nextInt();
		}
		
		System.out.println(largestNumInArray(a));
		
	}
	
	public static int largestNumInArray(int[] a)
	{
		return largestNumInArray(a, 0, a[0]);
	}
	
	public static int largestNumInArray(int[] a, int index, int control)
	{
		if (index == a.length)
			return control;
		
		if (a[index] > control)
			control = a[index];
		
		return largestNumInArray(a, index + 1, control);
	}

}
