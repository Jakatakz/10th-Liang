
public class C13_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test, uses max method to find the larger of two circles and the larger of two rectangles
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);
		
		System.out.println(C13_5_GeometricObject.max(c1,c2));
		
		Rectangle r1 = new Rectangle(3,6);
		Rectangle r2 = new Rectangle(2,4);
		
		System.out.println(C13_5_GeometricObject.max(r1,r2));
	}

}
