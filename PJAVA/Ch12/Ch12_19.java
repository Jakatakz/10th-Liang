/*import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ch12_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try 
		{
			URL url1 = new URL("https://yongdanielliang.github.io/contactinfo.html");
			Scanner reader1 = new Scanner(url1.openStream());
			ArrayList<String> randomStuff = new ArrayList<>();
			while (reader1.hasNext() && !reader1.nextLine().endsWith("me)"))
			{
				if (reader1.nextLine().startsWith("Fax:"))
					continue;
				randomStuff.add(reader1.nextLine());
			}
			for (String a: randomStuff)
				System.out.print(a + " ");
		} 
		catch(MalformedURLException ex)
		{
			System.out.println("maleformedURLException");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("ioexception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
*/