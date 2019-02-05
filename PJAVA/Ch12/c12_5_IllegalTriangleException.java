
public class c12_5_IllegalTriangleException extends Exception {

	private double side = 1.0;
	
	public c12_5_IllegalTriangleException(double side)
	{
		super(side + " is greater than the sum of the other two sides");
	}
	
	public double getSide()
	{
		return side;
	}
	
}
