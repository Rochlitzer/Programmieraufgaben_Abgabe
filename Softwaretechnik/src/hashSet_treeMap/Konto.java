package hashSet_treeMap;

public class Konto implements Comparable<Konto> {
	private String kontonr;
	private double betrag;
	private Kunde kunde;
	
	public Kunde getKunde() {
		return kunde;
	}
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	public String getKontonr() {
		return kontonr;
	}
	public void setKontonr(String kontonr) {
		this.kontonr = kontonr;
	}
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	
	public Konto (String kontonr, double betrag,Kunde kunde) {
		this.kontonr = kontonr;
		this.betrag = betrag;
		this.kunde = kunde;
		
	}
	public void geldueberweisen(){
		
	};
	
	@Override
	public int compareTo(Konto o) {
			Konto vergleich = (Konto) o;
			return this.getKontonr().compareTo(vergleich.getKontonr());
	}
	
	
	
	

}
