import java.util.Scanner;
import java.util.ArrayList;
public class c12_1 {

	public static void main(String[] args) {
	    // Check number of strings passed
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter query for only 2 numbers:");
		
		String query = input.nextLine();
		
		char[] array = query.toCharArray();
		System.out.println(array);
		for (int i = 0; i < array.length; i ++)
		{
			System.out.println(array[i]);
		}
		
		
		
	 

	    // The result of the operation
	    int result = 0;

	    try {
	    // Determine the operator
		    switch (array[1]) { 
		      case '+': result = Character.getNumericValue(array[0]) + 
		                         Character.getNumericValue(array[2]);
		                break;
		      case '-': result =  Character.getNumericValue(array[0]) - 
                      Character.getNumericValue(array[2]);
		                break;
		      case '*': result =  Character.getNumericValue(array[0]) * 
                      Character.getNumericValue(array[2]);
		                break;
		      case '/': result =  Character.getNumericValue(array[0]) / 
                      Character.getNumericValue(array[2]);
		    }
	    } catch(Exception ex) {
	    	System.out.println("exception, nonnumeric operand");
	    }
	    

	    System.out.println(array[1]);
	    // Display result
	    System.out.println(array[0] + " " + array[1] + " " + array[2]
	      + " = " + result);
	  }
}
