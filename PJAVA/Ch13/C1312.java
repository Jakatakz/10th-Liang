
public class C1312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C13_5_GeometricObject[] array1 = new C13_5_GeometricObject[4];
		array1[0] = new Circle();
		array1[1] = new Circle(11);
		array1[2] = new Rectangle();
		array1[3] = new Rectangle(7,8);
		
		System.out.println(sumArea(array1));
		
	}
	
	//sums the areas of all the geometric objects in an array
	public static double sumArea(C13_5_GeometricObject[] a)
	{
		double sum = 0;
		for (int i = 0; i < a.length; i ++)
		{
			sum += a[i].getArea();
		}
		return sum;
	}

}
