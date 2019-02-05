
public class C1310_Rectangle extends C13_5_GeometricObject {
  private double width;
  private double height;

  public C1310_Rectangle() {
  }

  public C1310_Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  @Override
  public boolean equals(Object o)
  {
	  boolean value;
	  if (o instanceof C1310_Rectangle && getArea() == ((C1310_Rectangle) o).getArea())
	  {
		  System.out.println("getarea: " + getArea());
		  value = true;
	  }
	  else
		  value = false;
	  return value;
  }


}