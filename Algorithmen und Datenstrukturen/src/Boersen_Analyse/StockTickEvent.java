package Boersen_Analyse;

public class StockTickEvent {

	private double kurs;

	public double getKurs() {
		return kurs;
	}

	public void setKurs(double letztKurs, double kursDiff) {
		this.kurs =(double) (letztKurs + kursDiff);
	}
	
	
}
