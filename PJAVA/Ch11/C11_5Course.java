import java.util.ArrayList;

public class C11_5Course {

	private String courseName;
	private ArrayList<String> students = new ArrayList<>(100);
	//private int numberOfStudents;
	
	public C11_5Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students.add(student);
	}
	
	public ArrayList<String> getStudents()
	{
		return students;
	}
			
	public int getNumberOfStudents()
	{
		return students.size();
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void printStudents()
	{
		for (int j = 0; j < students.size(); j++)
		{
			System.out.println(students.get(j));
		}
		System.out.println("just using sys");
		System.out.println(students);
	}
	
	public void dropStudent(String student)
	{
		students.remove(student);
	}
}
