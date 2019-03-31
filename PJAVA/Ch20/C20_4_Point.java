
public class C20_4_Point implements Comparable<C20_4_Point> {

	public double x;
	public double y;
	
	@Override
	public int compareTo(C20_4_Point p) {
		// TODO Auto-generated method stub
		if (p.x > x)
			return -1;
		else if (p.x < x)
			return 1;
		else if (p.y > y)
			return -1;
		else if (p.y < y)
			return -1;
		else
			return 0;
	}
	
	 @Override
	    public String toString() {
	        return "[" + String.format("%.2f",x) + ", " + String.format("%.2f",y) + "]";
	    }
	
	
}
