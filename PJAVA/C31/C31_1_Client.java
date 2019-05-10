import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class C31_1_Client implements Runnable {
	private static double annualInterestRate;
	private static int numOfYears;
	private static double loanAmount;

	public C31_1_Client(double annualInterestRate, int numOfYears, double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numOfYears = numOfYears;
		this.loanAmount = loanAmount;
	}
	public void run() {
	//send loan information (annual interest rate, # of years, loan amount) to server
	

		try 
		{
			Socket clientSocket1 = new Socket("localhost", 7998);
			DataInputStream readFromServer = new DataInputStream(clientSocket1.getInputStream());
			DataOutputStream writeToServer = new DataOutputStream(clientSocket1.getOutputStream());
			writeToServer.writeDouble(annualInterestRate);
			writeToServer.write(numOfYears);
			System.out.println("numOfYears : " + numOfYears);
			writeToServer.writeDouble(loanAmount);
			writeToServer.flush();
			//readFromServer.readDouble();
			//readFromServer.readDouble();
			System.out.println("read client finished");
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}
	
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public int getNumOfYears() {
		return numOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}
}