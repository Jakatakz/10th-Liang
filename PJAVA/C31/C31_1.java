
public class C31_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new C31_1_Server());
		Thread t2 = new Thread(new C31_1_Client(10,20,30));
		t1.start();
		t2.start();
		
	}

}
