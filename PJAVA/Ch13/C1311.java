
public class C1311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1311_Octagon o1 = new C1311_Octagon(5);
		System.out.println("area: " + o1.getArea() + "perimeter: " + o1.getPerimeter());
		try
		{
			C1311_Octagon o2 = (C1311_Octagon) o1.clone();
			System.out.println(o1.compareTo(o2));
		}
		catch(CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
		
		
	}

}
