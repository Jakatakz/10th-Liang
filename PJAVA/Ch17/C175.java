import java.io.*;
import java.util.Date;
public class C175 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		File file1 = new File("Exercise17_05.dat");
		int[] ar1 = new int[] {1,2,3,4,5};
		Date d1 = new Date();
		try (
				ObjectOutputStream out1 
				= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file1)));
			)
		{
			//int[] ar1 = new int[] {1,2,3,4,5};
			//Date d1 = new Date();
			out1.writeObject(ar1);
			out1.writeObject(d1);
			out1.writeDouble(5.5);
		}
		
		try (ObjectInputStream in1 = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(file1))))
		{
			ar1 = (int[]) in1.readObject();
			d1 =  (Date)(in1.readObject());
			double dubs = in1.readDouble();
			for (int i: ar1)
				System.out.println(i);
			System.out.println(ar1 + "\n" + d1 + "\n" + dubs);
		}
		
	}

}
