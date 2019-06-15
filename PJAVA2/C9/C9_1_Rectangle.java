
public class C9_1_Rectangle {

	double width = 1;
	double height = 1;

	public C9_1_Rectangle()
	{
	}
	
	public C9_1_Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return (width * height);
	}
	
	public double getPerimeter()
	{
		return ((2*width) + (2*height));
	}
	
	
}
