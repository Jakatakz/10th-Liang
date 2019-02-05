
public class IllegalTriangleException extends Exception {

	private double side;
	
	public IllegalTriangleException(double side)
	{
		super("invalid triangle side: " + side);
		this.side = side;
	}
	
	public double getSide()
	{
		return side;
	}
	
}
