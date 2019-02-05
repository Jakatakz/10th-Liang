
public class C11_Person {

	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	public C11_Person()
	{
		this("Unknown", "Unkknown", "Unknown", "Unknown");
	}
	
	public C11_Person(String name, String address, String phoneNumber, String emailAddress)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	@Override
	public String toString()
	{
		return "name: " + getName() + "\nclass name: " + this.getClass();
	}
	
	/*@Override
	public String toString()
	{
		String str = "name: " + name
				+ "\naddress: " + address 
				+ "\nphone number: " + phoneNumber 
				+ "\nemail address: " + emailAddress;
		return str;
	}*/

}
