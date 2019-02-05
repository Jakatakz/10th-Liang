import java.util.Scanner;
public class C11_1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("a color");
		String color = input.next();
		
		System.out.println("is filled?");
		boolean isFilled = input.nextBoolean();
		
		C11_Triangle obj1 = new C11_Triangle(side1, side2, side3);
		obj1.setColor(color);
		obj1.setFilled(isFilled);
		
		System.out.println("area: " + obj1.getArea() 
		+ "\nPerimeter: " + obj1.getPerimeter() 
		+ "\nColor: " + obj1.getColor() 
		+ "\nisFilled: " + obj1.isFilled());
		
	}

}
