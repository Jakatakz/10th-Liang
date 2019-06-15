import java.util.Random;

public class C9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rng1 = new Random();
		int[] array1 = new int[100000];
		for (int i = 0; i < array1.length; i++)
		{
			array1[i] = rng1.nextInt();
		}
		
		//using time, localtime, localdate classes
		C9_6_Stopwatch s1 = new C9_6_Stopwatch();
		s1.start();
		arraySort(array1);
		s1.stop();
		System.out.println(s1.getElapsedTime());
	}
	
	//selection sort
	public static void arraySort(int[] array1param)
	{
		for (int i = 0; i < array1param.length-1; i++)
		{
			int min = i;
			for (int k = 1; k < array1param.length; k++)
			{
				if (array1param[k] < array1param[min])
				{
					min = k;
				}
				
				int temp = array1param[min];
				array1param[min] = array1param[i];
				array1param[i] = temp;
			}
		}
	}

}
