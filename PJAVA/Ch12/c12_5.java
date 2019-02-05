
public class c12_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		C11_Triangle t1 = new C11_Triangle(60,2,3);
		} catch (c12_5_IllegalTriangleException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
