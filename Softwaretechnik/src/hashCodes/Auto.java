package hashCodes;

public class Auto {
	
	private int fahrgestellnummer;
	private String typ;
	
	public Auto(int fahrgestellnummer, String typ) {
	
		this.fahrgestellnummer = fahrgestellnummer;
		this.typ = typ;
	}

	public int getFahrgestellnummer() {
		return fahrgestellnummer;
	}

	public void setFahrgestellnummer(int fahrgestellnummer) {
		this.fahrgestellnummer = fahrgestellnummer;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	public int hashCode (){
		return (fahrgestellnummer + typ.hashCode())%10000;
	}
	
	
}
