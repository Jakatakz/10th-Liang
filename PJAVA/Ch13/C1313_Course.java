
public class C1313_Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public C1313_Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	@Override
	public Object clone() 
	{
		C1313_Course c1 = null;
		try
		{
			c1 = (C1313_Course)super.clone();
			c1.students = students.clone();
			c1.courseName = new String(courseName);
			return c1;
		}
		catch(CloneNotSupportedException ex)
		{
			System.out.println("caught");
			return null;
		}
		
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < numberOfStudents; i++)
		{
			if (students[i].equalsIgnoreCase(student))
			{
				students[i] = null;
				numberOfStudents--;
				while (i < numberOfStudents)
				{
					students[i] = students[i + 1];
					i++;
				}
				break;
			}
			
		}
		
	}
}
