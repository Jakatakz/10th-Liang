import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class C179 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		int addressBookIndex = 0;
		
		try (RandomAccessFile raf1 = new RandomAccessFile("C179", "rw"))
		{
			//clear file
			//raf1.setLength(0);
			ArrayList<ArrayList<byte[]>> arrayAddresses = new ArrayList<ArrayList<byte[]>>();
			C179Address.addToAddressBook(arrayAddresses,addressBookIndex);
			addressBookIndex++;
			writeAddressBookToRAF(raf1, arrayAddresses);
			
			//int count = 0;
			raf1.seek(0);
			
			System.out.println(raf1.readLine());
		
			raf1.seek(raf1.length());
			//count++;
			
			//writeName(raf1);
			//System.out.println("end");	
		} 
		catch( EOFException ex)
		{
			System.out.println("EOF exception raf1, exit");
			//ex.printStackTrace();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("FileNotFoundException: raf1");
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println("IOException raf1");
			ex.printStackTrace();
		}
		
		
	
		
		
		
	}
	
	
	
	public static void writeAddressBookToRAF(RandomAccessFile raf1Param, ArrayList<ArrayList<byte[]>> arrayAddresses_Param) throws IOException
	{
		System.out.println("writeAddressBookToRAF");
		int dec = arrayAddresses_Param.size();
		System.out.println("dec: " + dec);
		int inc = 0;
		while(dec != 0)
		{
			for (int i = 0; i < 5; i++)
			{
				if ( i >= 3)
				{
					raf1Param.writeBytes(System.getProperty("line.seperator"));
				}
				raf1Param.write(arrayAddresses_Param.get(dec-1).get(i));
				raf1Param.seek(raf1Param.length());
			}
			dec--;
		}
		
		//raf1Param.seek(0);
		/*System.out.println("read: ");
		while (true)
			System.out.print(raf1Param.readChar());*/
	}
	
	

}
