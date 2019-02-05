import java.util.Scanner;
public class C11_5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		C11_5Course math = new C11_5Course("math");
		
		System.out.println("Enter number of students");
		int numberOfStudents = input.nextInt();
		for (int j = 0; j < numberOfStudents; j++)
			{
				System.out.println("Enter student " + j + "'s name: " );
				math.addStudent(input.next());
			}
		System.out.println(math);
		math.printStudents();
	}

}
