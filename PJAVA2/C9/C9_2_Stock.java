
public class C9_2_Stock {

	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public C9_2_Stock(String symbol, String name)
	{
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent()
	{
		return (Math.abs(currentPrice - previousClosingPrice) / ((currentPrice+previousClosingPrice) / 2)) * 100;
	}
	
	public void setCurrentPrice(double currentPrice)
	{
		this.previousClosingPrice = this.currentPrice;
		this.currentPrice = currentPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice)
	{
		this.previousClosingPrice = previousClosingPrice;
	}
	
}
