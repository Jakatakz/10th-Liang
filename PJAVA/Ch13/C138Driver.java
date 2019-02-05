import java.util.ArrayList;

public class C138Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C138 c1 = new C138();
		
		for (int i = 0; i < 10; i ++)
		{
			c1.push(i);
		}
		
		C138 c2 = (C138) c1.clone();
		c2.pop();
		c2.pop();
		
		Object value = 2;
		System.out.println(value instanceof Integer);
	
		System.out.println("size c1: " + c1.getSize());
		System.out.println("size c2: " + c2.getSize());
	}
	
	
	
}
