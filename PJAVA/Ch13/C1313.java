
public class C1313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1313_Course cc1 = new C1313_Course("Math");
		cc1.addStudent("bob");
		cc1.addStudent("fred");
		cc1.addStudent("dereK");
		C1313_Course cc2 = (C1313_Course) cc1.clone();
		System.out.println("c1: " + cc1.getStudents());
		System.out.println("c2: " + cc2.getStudents());
		
		System.out.println(cc1 == cc2);
		System.out.println(cc1.getCourseName() == cc2.getCourseName());
	    System.out.println(cc1.getStudents() == cc2.getStudents());
	}

}
