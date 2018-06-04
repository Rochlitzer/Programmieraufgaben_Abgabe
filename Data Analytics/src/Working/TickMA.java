package Working;

public class TickMA {
	
	private String symbol;
	private double movAvg;
	private String timeStamp;
	private double price; 

	public TickMA(String s, double m, String t, double p) {
		this.symbol = s;
		this.movAvg = m;
		this.timeStamp = t;
		this.price = p;
	}
	
	public double getPrice() {
		return price;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getTimeStamp() {
		return timeStamp;
	}
	
	public double getMovAvg() {
		return movAvg;
	}

	@Override
	public String toString() {
		return "Aktie " + symbol + " Price: " + price + " Time: " + timeStamp + " MovAvg: " + movAvg;
	}

}