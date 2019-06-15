import java.util.Random;
public class C9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rng1 = new Random(1000);
		for (int i = 0; i < 50; i ++)
		{
			if (i % 10 == 0)
				System.out.println();
			System.out.print(rng1.nextInt(100) + " ");
		}
		
	}

}
