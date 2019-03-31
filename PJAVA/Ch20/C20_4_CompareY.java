import java.util.Comparator;

public class C20_4_CompareY implements Comparator<C20_4_Point>{

	@Override
	public int compare(C20_4_Point p1, C20_4_Point p2) {
		// TODO Auto-generated method stub
		if (p1.y > p2.y)
			return 1;
		else if (p1.y < p2.y)
			return -1;
		else if (p1.x > p2.x)
			return 1;
		else if (p1.x < p2.x)
			return -1;
		else
			return 0;
	}

}
