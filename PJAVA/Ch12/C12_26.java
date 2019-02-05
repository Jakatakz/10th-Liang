import java.io.File;
import java.util.Scanner;
public class C12_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader1 = new Scanner(System.in);
		System.out.println("enter folder");
		String dir26 = reader1.next();
		File dir26File = new File(dir26);
		if (dir26File.mkdir())
		{
			System.out.println("directory exists and created: " + dir26File);
		}
		else
			System.out.println("directory doesn't exist");
		
		reader1.close();
		
	}

}
