import java.io.*;
public class C178 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file1 = new File("Exercise17_08.dat");

		//int numTimesProgramRun;
		try (RandomAccessFile raf = new RandomAccessFile(file1, "rw"))
		{
			int numTimesProgramRun = (raf.length() != 0) ? raf.readInt() + 1 : 1;
			raf.seek(0);
			raf.writeInt(numTimesProgramRun);
			System.out.println("num of times program access: " + numTimesProgramRun);
			
		}
	}

}
