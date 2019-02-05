
public class C1311_Octagon extends C13_5_GeometricObject implements Comparable<C13_5_GeometricObject>, Cloneable {

	private double side;
	
	public C1311_Octagon()
	{
		this(5);
	}
	
	public C1311_Octagon(double side)
	{
		this.side = side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public double getArea() {
		
		double area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 8 * side;
		return perimeter;
	}

}
