import java.util.GregorianCalendar;
public class C13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int args1 = 0;
		int args2 = 0;
		if (args.length != 2)
		{
			System.out.println("too many args, exiting");
			System.exit(1);
		}
		else 
		{
			if (Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > 12)
			{
				System.out.println("month not 1-12");
				System.exit(2);
			}
			args1 = Integer.parseInt(args[0]);
			//System.out.println("first parse args1: " + args1);
		}
		try
		{
			args2 = Integer.parseInt(args[1]);
		} catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} 
	
		//System.out.println("args2: " + args2);
		GregorianCalendar cal1 = new GregorianCalendar(args2, args1, 1);
		displayCalender(cal1);
		
	}
	
	public static void displayCalender(GregorianCalendar cal1_param)
	{
		
		//System.out.println("cal1_param before: " + cal1_param.get(cal1_param.MONTH));
		int args1 = cal1_param.get(cal1_param.MONTH);
		int args2 = cal1_param.get(cal1_param.YEAR);
		//System.out.println("args1: " + args1 + "\nargs2: " + args2);
		
		//includes ---- and days
		String monthName = getMonthName(args1);
		displayMonthTitle(args1, args2, monthName);
		
		displayNumberOfDays(args1);
		
		
		
	}
	
	public static void displayMonthTitle(int args1_param, int args2_param, String monthName_param)
	{
		System.out.printf("%12s, %1d", monthName_param, args2_param);
		System.out.println("\n----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	
	public static void displayNumberOfDays(int args1_param)
	{
		//jan - dec
		int month = args1_param;
		int numOfDays = 0;
		switch (month)
		{
			case 1: numOfDays = 31;
				break;
			case 2: numOfDays = 28;
				break;
			case 3: numOfDays = 31;
				break;
			case 4: numOfDays = 30;
				break;
			case 5: numOfDays = 31;
				break;
			case 6: numOfDays = 30;
				break;
			case 7: numOfDays = 31;
				break;
			case 8: numOfDays = 31;
				break;
			case 9: numOfDays = 30;
				break;
			case 10: numOfDays = 31;
				break;
			case 11: numOfDays = 30;
				break;
			case 12: numOfDays = 31;
				break;
		}
			
		//System.out.println("month: "  + month);
		for (int i = 1 ; i <= numOfDays; i++)
		{
			
			if (i == 1 || i == 8 || i == 15|| i == 22 || i == 29)
				System.out.printf("%3d",  i);
			else if (i % 7 == 0)
				System.out.printf("%4d\n", i);
			else
				System.out.printf("%4d", i);
		}
		
	}
	
	public static String getMonthName(int args1_param)
	{
		String monthName = "";
		int month = args1_param;
		switch (month)
		{
			case 1: monthName = "Jan";
				break;
			case 2: monthName = "Feb";
				break;
			case 3: monthName = "Mar";
				break;
			case 4: monthName = "Apr";
				break;
			case 5: monthName = "May";
				break;
			case 6: monthName = "Jun";
				break;
			case 7: monthName = "Jul";
				break;
			case 8: monthName = "Aug";
				break;
			case 9: monthName = "Sep";
				break;
			case 10: monthName = "Oct";
				break;
			case 11: monthName = "Nov";
				break;
			case 12: monthName = "Dec";
				break;
		}
		return monthName;
	}

}
