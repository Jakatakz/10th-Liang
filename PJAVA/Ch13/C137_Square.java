
public class C137_Square extends C13_5_GeometricObject implements Colorable {

	private double s;
	//private double y;
	
	public C137_Square()
	{
		
	}
	
	public C137_Square(double s)
	{
		this.s = s;
	}
	
	@Override
	public String howToColor()
	{
		return "Color all four sides";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return s * s;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * s;
	}
}
