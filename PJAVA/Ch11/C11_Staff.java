
public class C11_Staff extends C11_Employee {
	
	//staff member has a title
	
	private String title;
	
	public C11_Staff()
	{
		this ("unknown", "unknown", "unknown", "unknown", false, 0, "unknown");
	}
	
	public C11_Staff(String name, String address, String phoneNumber, String emailAddress, 
			boolean hasOffice, double salary, String title)
	{
		super(name, address, phoneNumber, emailAddress, hasOffice, salary);
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	@Override
	public String toString()
	{
		return "name: " + getName() + "\nclass name: " + this.getClass();
	}

	/*@Override
	public String toString()
	{
		return super.toString() + "\ntitle: " + title;
	}*/
}
