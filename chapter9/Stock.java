package chapter9;

public class Stock {
	
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	// Constructor initalizes symbol and name
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getPrecentChange() {
		return ((this.currentPrice - this.previousClosingPrice) / this.currentPrice) * 100;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	

}
