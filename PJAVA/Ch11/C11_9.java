import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class C11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> largestOneRow = new ArrayList<>();
		ArrayList<Integer> largestOneCol = new ArrayList<>();
		
		System.out.println("Enter size of matrix nxn");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] matrix1 = new int[n][n];
		//System.out.println("m1.length: " + matrix1.length);
		
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[i].length; j++)
			{
				matrix1[i][j] = ( (int)Math.round(Math.random()) );
			}
		}
		
		mostOneRowCheck(matrix1, largestOneRow);
		mostOneColumnCheck(matrix1, largestOneCol);
		printMatrix(matrix1);
		
		System.out.println("\nThe largest row index: " + largestOneRow);
		
		//to get rid of brackets
		System.out.println("\nlargest row index: " );
		for (Integer c: largestOneRow)
			System.out.print(c + " ");
		
		
		
		System.out.println("The largest column index " + largestOneCol);
		
		//to get rid of brackets
		System.out.println("the largest column index: " );
		for (Integer c: largestOneCol)
		{
			System.out.print(c + " ");
		}
		
		
	}
	
	public static void mostOneRowCheck(int[][] matrix1, ArrayList<Integer> largestOneRow)
	{
		//int[][] matrix = matrix1;
		//ArrayList<Integer> largestOneRow1 = largestOneRow;
		int highestOccurance = 0;
		
		for (int i = 0; i < matrix1.length; i++)
		{
			int occurance = 0;
			for (int j = 0; j < matrix1[i].length; j++)
			{
				if (matrix1[i][j] == 1)
					occurance++;
			}
			if (highestOccurance < occurance)
			{
				highestOccurance = occurance;
				largestOneRow.clear();
				largestOneRow.add(i);
			}
			else if (highestOccurance == occurance)
				largestOneRow.add(i);
		}
		System.out.println("passed row check");
		
	}
	
	public static void mostOneColumnCheck(int[][] matrix1, ArrayList<Integer>  largestOneCol)
	{
		int highestOccurance = 0;
	
		for (int j = 0; j < matrix1[0].length; j++)
		{
			int occurance = 0;
			for (int i = 0 ; i <  matrix1.length; i++)
			{
				if (matrix1[i][j] == 1)
					occurance++;
			}
			if (highestOccurance < occurance)
			{
				highestOccurance = occurance;
				largestOneCol.clear();
				largestOneCol.add(j);
			}
			else if (highestOccurance == occurance)
				largestOneCol.add(j);
		}
		
		System.out.println("passed col check");
		
	}
	
	public static void printMatrix(int[][] matrix1)
	{
		System.out.println("passed print check");
		for (int i = 0; i < matrix1.length; i++)
		{
			System.out.println();
			for (int j = 0; j < matrix1[i].length; j++)
			{
				System.out.print(matrix1[i][j]  + " ");
			}
		}
	}
	
	

}
