
public class C139_Circle extends C13_5_GeometricObject {

	private double radius;
	public C139_Circle()
	{
		
	}
	
	public C139_Circle(double radius)
	{
		this.radius = radius;
	}
	public C139_Circle(double radius, String color, boolean filled)
	{
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return radius */
	  public double getRadius() 
	  {
	    return radius;
	  }

	  /** Set a new radius */
	  public void setRadius(double radius) 
	  {
	    this.radius = radius;
	  }

	  /** Return area */
	  public double getArea() 
	  {
	    return radius * radius * Math.PI;
	  }
	  
	  /** Return diameter */
	  public double getDiameter() 
	  {
	    return 2 * radius;
	  }
	  
	  /** Return perimeter */
	  public double getPerimeter() 
	  {
	    return 2 * radius * Math.PI;
	  }

	  /* Print the circle info */
	  public void printCircle() 
	  {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
	
	  @Override
	  public boolean equals(Object o)
	  {
		  boolean value;
		  if (o instanceof C139_Circle && radius == ((C139_Circle) o).radius)
			  value = true;
		  else
			  value = false;
		  return value;
	  }
	  


}
