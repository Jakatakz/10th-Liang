import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class C179Address {

	private final static int NAMEBYTE = 32;
	private final static int STREETBYTE = 32;
	private final static int CITYBYTE = 20;
	private final static int STATEBYTE = 2;
	private final static int ZIPBYTE = 5;
	//static int addressBookIndex = 0;
	
	
	static Scanner input1 = new Scanner(System.in);
	
	public C179Address()
	{
		//default
	}
	
		//come back to fix
		public static void addToAddressBook(ArrayList<ArrayList<byte[]>> arrayAddresses_Param, int addressBookIndex_Param)
		{
			System.out.println("addToAddressBook");
			
			ArrayList<byte[]> row = new ArrayList<>();
			row.add(setName());
			row.add(setStreet());
			row.add(setCity());
			row.add(setState());
			row.add(setZIP());
			arrayAddresses_Param.add(row);
			
			/*arrayAddresses_Param.add(new ArrayList<byte[]>());
			System.out.println("1 " + arrayAddresses_Param.size());
			System.out.println("2 " + arrayAddresses_Param.get(0).size());
			arrayAddresses_Param.get(addressBookIndex_Param).add(setName());
			arrayAddresses_Param.get(addressBookIndex_Param).add(setStreet());
			arrayAddresses_Param.get(addressBookIndex_Param).add(setCity());
			arrayAddresses_Param.get(addressBookIndex_Param).add(setState());
			arrayAddresses_Param.get(addressBookIndex_Param).add(setZIP());*/
			//System.out.println("2 " + arrayAddresses_Param.get(0).size());
			//arrayAddresses_Param.get(addressBookIndex).add(5, setName());
			System.out.println("End of arraylist");
			input1.close();
			//addressBookIndex++;
		}
	
		public static byte[] setName()
		{
			System.out.println("setName()");
			System.out.println("Enter name: ");
			//Scanner input1 = new Scanner(System.in);
			String name = input1.nextLine();
			byte[] nameFixed = getFixed(name, NAMEBYTE);
			//input1.close();
			return nameFixed;
		}
		
		public static byte[] setStreet()
		{
			System.out.println("setStreet()");
			System.out.println("Enter Street: ");
			String street = input1.nextLine();
			
			byte[] streetFixed = getFixed(street, STREETBYTE);
			
			return streetFixed;
		}
		
		public static byte[] setCity()
		{
			System.out.println("setCity()");
			System.out.println("Enter City: ");
			String city = input1.nextLine();
			byte[] cityFixed = getFixed(city, CITYBYTE);
			
			return cityFixed;
		}
		
		public static byte[] setState()
		{
			System.out.println("setState()");
			System.out.println("Enter State: ");
			String state = input1.nextLine();
			byte[] stateFixed = getFixed(state, STATEBYTE);
			
			return stateFixed;
		}
		
		public static byte[] setZIP()
		{
			System.out.println("setZIP()");
			System.out.println("Enter ZIP: " );
			String ZIP = input1.nextLine();
			byte[] ZIPFixed = getFixed(ZIP, ZIPBYTE);
			
			return ZIPFixed;
		}
		
		public static byte[] getFixed(String Param, int fixedSize)
		{
			System.out.println("getFixed()");
			byte[] fixedArray = new byte[fixedSize];
			System.out.println("fixedArray done");
			byte[] sourceArray = Param.getBytes();
			System.out.println("sourceArray done");
			System.arraycopy(sourceArray, 0, fixedArray, 0, Math.min(sourceArray.length,fixedSize));	//math.min to pick smaller of two integers, otherwise indexOutOfBoundsException
			System.out.println("copied");
			return fixedArray;
		}
		
		//retrieve
		public static void getAddress()
		{
			
		}
		
		public static void updateAddress()
		{
			
		}
		
		public static void firstAddress()
		{
			
		}
		
		public static void lastAddress()
		{
			
		}
		
		public static void nextAddress()
		{
			
		}
		
		public static void previousAddress()
		{
			
		}
	
}
