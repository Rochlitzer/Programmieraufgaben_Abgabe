package Working;

import java.util.Date;

public class Tick {

	private String symbol;
	private Double price;
	private String timeStamp;

	public Tick(String s, double p, String t) {
		this.symbol = s;
		this.price = p;
		this.timeStamp = t;
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

	@Override
	public String toString() {
		return "Price: " + price.toString() + " time: " + timeStamp.toString();
	}

}// End of Class