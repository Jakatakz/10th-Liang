
public abstract class C13_5_GeometricObject implements Comparable<C13_5_GeometricObject> {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected C13_5_GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected C13_5_GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  //static max method for finding the largfer of two geoemetricobject objects,
  public static String max(C13_5_GeometricObject param1, C13_5_GeometricObject param2)
  {
	  //System.out.println("param1: " + param1);
	  //System.out.println("param1: " + param2);

	  	
	  
	  int result = param1.compareTo(param2);
	  String resultStr;
	  if (result >= 0)
		  resultStr = "greater than or equal to: " + result;
	  else
		  resultStr = "less than: " + result;
	  return resultStr;
  }
  
  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  


  
  @Override
  public int compareTo(C13_5_GeometricObject o) {
  	// TODO Auto-generated method stub
  	if (getArea() > o.getArea())
  		return 1;
  	else if (getArea() < o.getArea())
  		return -1;
  	else
  		return 9;
  }
  
  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}