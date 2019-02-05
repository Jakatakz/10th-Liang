
public class C11_Faculty extends C11_Employee {

	//faculty member has office hours and a rank
	
	private String officeHours;
	private int rank;
	
	public C11_Faculty()
	{
		this("unknown", "unknown", "unknown", "unknown", false, 0, "0", 3);
	}
	
	public C11_Faculty(String name, String address, String phoneNumber, String emailAddress, 
			boolean hasOffice, double salary, String officeHours, int rank)
	{
		super(name,  address, phoneNumber, emailAddress, hasOffice, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		
		String str;
		switch (rank)
		{
		case 1: str = "highest rank";
		break;
		case 2: str = "medium rank";
		break;
		case 3: str = "low rank";
		break;
		default: str = "rank error";
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
		return super.toString() + "\noffice hours " + officeHours + "\nrank: " + rank;
	}*/
	
}
