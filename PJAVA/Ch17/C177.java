import java.io.*;

public class C177 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
		
		double totalLoanAmt = 0;
		C176 t = null;
		
		try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(file1)))
		{
			while ((t = (C176) in1.readObject()) != null)
			{
				totalLoanAmt += t.getLoanAmount();
			}
			
		}
		catch(EOFException ex)
		{
			System.out.println("total loan amt: " + totalLoanAmt);
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		
	}

}
