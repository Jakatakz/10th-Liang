
public class C11_Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public C11_Triangle() throws c12_5_IllegalTriangleException
	{
		this(1.0, 1.0, 1.0);
	}
	
	public C11_Triangle(double side1, double side2, double side3) throws c12_5_IllegalTriangleException
	{
		if (side1 + side2 < side3)
			throw new c12_5_IllegalTriangleException(side3);

		if (side1 + side3 < side2)
			throw new c12_5_IllegalTriangleException(side2);

		if (side2 + side3 < side1)
			throw new c12_5_IllegalTriangleException(side1);
		
		this.side1 = side2;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea()
	{
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter()
	{
		return (side1+side2+side3);
	}
	
	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
