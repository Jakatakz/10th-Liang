import java.time.LocalTime;

public class C9_6_Stopwatch {

	private int startTime;
	private int endTime;
	
	
	
	public void start()
	{
		//reset startTime to current time
		LocalTime lt1 = LocalTime.now();
		String currentTime = lt1.toString();
		LocalTime time = LocalTime.parse(currentTime);
		this.startTime = time.toSecondOfDay();
		System.out.println("start time: " + currentTime);
	}
	
	public void stop()
	{
		//sets endTime to current time
		LocalTime lt1 = LocalTime.now();
		String currentTime = lt1.toString();
		LocalTime time = LocalTime.parse(currentTime);
		this.endTime = time.toSecondOfDay();
		System.out.println("end time: " + currentTime);
	}
	
	public int getElapsedTime()
	{
		//returns the elapsed time for teh stopwatch in milliseconds
		System.out.println("getelapsedtime: " + (endTime - startTime));
		return endTime - startTime;
	}
	
}
