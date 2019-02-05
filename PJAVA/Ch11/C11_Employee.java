
public class C11_Employee extends C11_Person {
	/*
	 * An employee has an office, salary, and date hired. Use the MyDate class defined in Programming
		Exercise 10.14 to create an object for date hired.
	 */
	
	private boolean hasOffice;
	private double salary;
	private MyDate dateHired;

	public C11_Employee()
	{
		this("unknown", "unknown", "unknown", "unknown", false, 0);
		this.hasOffice = false;
		this.salary = 0.0;
	}
	
	public C11_Employee(String name, String address, String phoneNumber, String emailAddress, 
			boolean hasOffice, double salary)
	{
		super(name, address, phoneNumber, emailAddress);
		this.hasOffice = hasOffice;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	public boolean isHasOffice() {
		return hasOffice;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getDateHired() {
		return dateHired;
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
				"\nhas office? " + hasOffice + 
				"\nsalary: " + salary +
				"\ndate hired: " + dateHired;	//does this mydate object implicitly call its tostringmethod
	}*/
	
}
