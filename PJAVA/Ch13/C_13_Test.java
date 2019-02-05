import java.util.Scanner;
public class C_13_Test {

	public static void main(String[] args) throws IllegalTriangleException {
		// TODO Auto-generated method stub
		
		/*
		 * enter 3 sides of the triangle
		 * a color
		 * bool value if triangle is filled
		 * 
		 * display area, perimetter, color, and true false for isfilled
		 */

		boolean isFilled;
		Scanner reader1 = new Scanner(System.in);
		
		System.out.println("Enter 3 sides of the triangle: ");
		double side1 = reader1.nextInt();
		double side2 = reader1.nextInt();
		double side3 = reader1.nextInt();
		
		System.out.println("Enter a color: ");
		String color = reader1.next();
		
		System.out.println("is it filled?");
		String isFilledStr = reader1.next();
		if (isFilledStr.equals("y"))
			isFilled = true;
		else if (isFilledStr.equals("n"))
			isFilled = false;
		else
			isFilled = false;
		try
		{
		C_13_Triangle triangle1 = new C_13_Triangle(side1, side2, side3, color, isFilled);
		System.out.println("area: " + triangle1.getArea());
		System.out.println("Perimeter: " + triangle1.getPerimeter());
		System.out.println("color: " + triangle1.getColor());
		System.out.println("isFilled: " + triangle1.isFilled());
		System.out.println("date created: " + triangle1.getDateCreated());
		}
		catch (IllegalTriangleException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
		
		
	}

}
