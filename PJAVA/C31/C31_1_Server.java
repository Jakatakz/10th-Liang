import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C31_1_Server implements Runnable{
	
	@Override
	public void run() {
		//compute monthly payment and total payment, sends them back to client
	
		
			try
			{
				ServerSocket serverSocket1 = new ServerSocket(7998);
				System.out.println("server started");
				Socket socket1 = serverSocket1.accept();
				DataInputStream inputFromClient = new DataInputStream(socket1.getInputStream());
				DataOutputStream outputToClient = new DataOutputStream(socket1.getOutputStream());
				
				
					
					double annualInterestRate = inputFromClient.readDouble();
					System.out.println("annualIR: " + annualInterestRate);
					int numOfYears = inputFromClient.readInt();
					System.out.println("numYr: " + numOfYears);
					double loanAmount = inputFromClient.readDouble();
					System.out.println("loanamt: " + loanAmount);
					double monthlyPayment = getMonthlyPayment(annualInterestRate, loanAmount, numOfYears);
					double totalPayment = getTotalPayment(monthlyPayment, numOfYears);
					outputToClient.writeDouble(monthlyPayment);
					outputToClient.writeDouble(totalPayment);
					outputToClient.flush();
					System.out.println("end while");
				
			} catch (IOException ex)
			{
				ex.printStackTrace();
			}
			
	}
		/** Find monthly payment */
		  public static double getMonthlyPayment(double annualInterestRate, double loanAmount, int numOfYears) {
		   double monthlyInterestRate = annualInterestRate / 1200;
		   double monthlyPayment = loanAmount
		     * monthlyInterestRate
		     / (1 - (1 / Math.pow(1 + monthlyInterestRate,
		       numOfYears * 12)));
		   return monthlyPayment;
		  }
	
		  /** Find total payment */
		  public static double getTotalPayment(double monthlyPayment, int numOfYears) {
		   double totalPayment = monthlyPayment * numOfYears * 12;
		   return totalPayment;
		  }
	
}
