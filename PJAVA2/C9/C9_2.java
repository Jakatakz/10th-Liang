
public class C9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C9_2_Stock s1 = new C9_2_Stock("ORCL", "Oracle Corporation");
		s1.setCurrentPrice(34.5);
		s1.setCurrentPrice(34.35);
		System.out.println("Price change: " + s1.getChangePercent());
	}

}
