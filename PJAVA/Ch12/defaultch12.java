import java.util.ArrayList;
import java.util.Scanner;

public class defaultch12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter url");
		String url = input.next();
		
		//crawl(url);
	}
	
	public void crawl(String startingUrlString)
	{
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		listOfPendingURLs.add(startingUrlString);
		
		while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100)
		{
			String urlString = listOfPendingURLs.remove(0);
			listOfTraversedURLs.add(urlString);
			System.out.println("Crawl " + urlString);
		}
	}

}
