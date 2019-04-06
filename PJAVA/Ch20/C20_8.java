import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class C20_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//theres still some bugs such as user input errors to handle 

		//sort 3 digits in both lists into two lists and use containsAll to check for $2000 reward
		List<Integer> lotteryNumber = new ArrayList<>();
		List<Integer> userInput = new ArrayList<>();
		getLotteryNumber(lotteryNumber);
		int actualLotteryNumber = getActualLotteryNumber(lotteryNumber);
		System.out.println("Lottery Number for checking: " + actualLotteryNumber);
		int userInputNum = getUserInput(userInput);
		System.out.println("Your user input for checking: " + userInputNum);
		Collections.sort(userInput);
		Collections.sort(lotteryNumber);
		checkAndDisplayUserInputForRewards(userInput, lotteryNumber, actualLotteryNumber, userInputNum);
	}
	
	public static int getActualLotteryNumber(List<Integer> lotteryNumber)
	{
		String lotNumStr = "";
		for (int i = 0; i < lotteryNumber.size(); i++)
		{
			lotNumStr += lotteryNumber.get(i).intValue();
		}
		System.out.println("lotNumStr: " + lotNumStr);
		int lotNum = Integer.parseInt(lotNumStr);
		return lotNum;
		
	}
	
	public static void getLotteryNumber(List<Integer> lotteryNumber)
	{
		Random rnd1 = new Random();
		int chk = 0;
		while(chk != 3)
		{
			lotteryNumber.add(rnd1.nextInt(10));
			chk++;
		}
	}
	
	public static int getUserInput(List<Integer> userInput)
	{
		
		Scanner input = new Scanner(System.in);
		//String userInputForLotteryStr = "";
		int userInputForLottery = 0;
		boolean chkr = true;
		
		while (chkr)
		{
			System.out.println("Enter a 3 digit number for the lottery: ");
			if (input.hasNextInt())
			{
				userInputForLottery = input.nextInt();
				System.out.println("userInputForLottery: " + userInputForLottery);
				chkr=false;
			}
			else
			{
				System.out.println("need number thats 3 digits");
				input.nextLine();
			}
		}
		
		input.close();
		int userInputForChk = userInputForLottery;
		int numOfIntegers = String.valueOf(userInputForChk).length();
		System.out.println(numOfIntegers);
		while (numOfIntegers != 3)
		{
			numOfIntegers++;
		}
		while (numOfIntegers !=0)
		{
				userInput.add(userInputForLottery%10);
				userInputForLottery /= 10;
				System.out.println("number: " + userInputForLottery);
				numOfIntegers--;
		}
		Collections.reverse(userInput);	//did this so it matches the correct order of user input
		System.out.println("inside getUserInput, userInput list check: " + userInput);
		return userInputForChk;
	}
	
	public static void checkAndDisplayUserInputForRewards(List<Integer> userInput, List<Integer> lotteryNumber, int actualLotteryNumber, int userInputNum)
	{
			if (userInputNum == actualLotteryNumber)
				System.out.println(userInputNum + " = " + actualLotteryNumber + ", You won the $10,000 Lottery");
			else if (userInput.equals(lotteryNumber))
				System.out.println(userInputNum + " contains all numbers without order mattering in " + actualLotteryNumber + ", You won $3,000");
			else if (chkDigits(userInput, lotteryNumber) == 2)
				System.out.println(userInputNum + " contains 2 numbers in " + actualLotteryNumber + ", you won $2000");
			else if (chkDigits(userInput, lotteryNumber) == 1)
				System.out.println(userInput + " contains 1 number in " + actualLotteryNumber + ", you won $1000");
			else
				System.out.println(userInput + " contains 0 numbers in " + actualLotteryNumber + ", you didn't win");
	}
	
	public static int chkDigits(List<Integer> userInput, List<Integer> lotteryNumber)
	{
		int bonus = 0;
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (userInput.get(i).equals(lotteryNumber.get(j)))
				{
					bonus++;
					break;
				}
			}
		}
		//0 is error, just checking to make sure this works
		if (bonus != 2 && bonus != 1)
			bonus = 0;
		return bonus;
	}

}
