import java.io.*;
public class C176_tester {

	public static void main(String[] args) throws IOException, NotSerializableException {
		// TODO Auto-generated method stub

		C176 c1 = new C176();
		C176 c2 = new C176(2.5,1,1500);
		C176 c3 = new C176(2.5,1,2000);
		C176 c4 = new C176(2.5,1,2500);
		C176 c5 = new C176(2.5,1,3000);
		
		File file1 = new File("Exercise 17_06.dat");
		try (ObjectOutputStream out1 = 
				new ObjectOutputStream(new FileOutputStream(file1)))
			{
				out1.writeObject(c1);
				out1.writeObject(c2);
				out1.writeObject(c3);
				out1.writeObject(c4);
				out1.writeObject(c5);
			}
		
	}

}
