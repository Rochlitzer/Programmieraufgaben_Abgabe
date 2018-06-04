package Sortieren;

public class StockTick {
	private String symbol;
	private int kurs;
	
	public StockTick() {}
	
	public StockTick(String symbol, int kurs) {
		super();
		this.symbol = symbol;
		this.kurs = kurs;
	}

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getKurs() {
		return kurs;
	}
	public void setKurs(int kurs) {
		this.kurs = kurs;
	}

	public String print() { 
		return "Symbol: "+ getSymbol() + " Kurs: " + getKurs();
		}
	
	

}
