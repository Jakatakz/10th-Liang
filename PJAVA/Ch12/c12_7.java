/*import java.util.Scanner;
public class c12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter binary string");
		bin2Dec(input.next());
	}
	
	public static int bin2Dec(String binString)
	{
		try
		{
			
		
		int sum = 0;
		String[] binStringArray = new String[binString.length()];
		binStringArray = binString.split("");
		int[] binIntArray = new int[binString.length()];
		
		
		
		for (int i = 0; i < binStringArray.length; i++)
		{
			binIntArray[i] = Integer.parseInt(binStringArray[i]);
		}
		
		//for each loop instead?
		for (int i = 0; i < binStringArray.length; i++)
		{
			if (!(binIntArray[i] == 1) || !(binIntArray[i] == 0))
				throw new NumberFormatException("not a binary string");
		}
		
		//convert binary to decimal
		for (int i = 0 ; i < binStringArray.length; i++)
		{
			
		}
		
		return sum;
		} catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
		}
	
	}

}
*/