
public class C11_2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C11_Person person1 = new C11_Person("Bob", "406 Murry Park", "5555555555", "buthead@gmail.com");
		
		C11_Student student1 = new C11_Student("Dude", "407 Murry Park", "66666666666", 
				"yarlo@gmail.com", 2);
		
		C11_Employee employee1 = new C11_Employee("Foxy", "408 Murry Park", "7777777777",
				"hagorl@gmail.com", true, 32000);
		
		C11_Faculty faculty1 = new C11_Faculty("toysa", "329 Throwman City", "8888888888", 
				"judfju@gmail.com", false, 70000, "7am-9am", 2);
		
		C11_Staff staff1 = new C11_Staff("joysoss", "420 burp city", "99999999999", 
				"yuyuyop@gmail.com", true, 66000, "retard");
		
		System.out.println("person1: " + person1.toString());
		System.out.println("\nstudent1: " + student1.toString());
		System.out.println("\nemployee1: " + employee1.toString());
		System.out.println("\nfaculty1: " + faculty1.toString());
		System.out.println("\nstaff1: " + staff1.toString());
	}

}
