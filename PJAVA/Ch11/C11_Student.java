
public class C11_Student extends C11_Person {

	/*
	 * A student has a class status (freshman,sophomore, junior, or senior). 
		Define the status as a constant.
	 */
	private static final int FRESHMEN = 1;
	private static final int SOPHOMORE = 2;
	private static final int JUNIOR = 3;
	private static final int SENIOR = 4;
	private int status;
	
	public C11_Student()
	{
		super();
		this.status = 1;
		//this("unknown", "unknown", "unknown", "unknown", 1);
	}
	
	public C11_Student(String name, String address, String phoneNumber, String emailAddress, int status)
	{
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	
	
	public String getStatus()
	{
		String str;
		switch(status)
		{
		case 1: str = "freshmen";
				break;
		case 2: str =  "sophmore";
				break;
		case 3: str =  "junior";
				break;
		case 4: str = "senior";
				break;
		default: str = "unknown";
				break;
		}		
		return str;
	}
	
	@Override
	public String toString()
	{
		return "name: " + getName() + "\nclass name: " + this.getClass();
	}
	
	/*@Override
	public String toString()
	{
		return super.toString() +
				"\nstatus: " + status;
	}*/
}
