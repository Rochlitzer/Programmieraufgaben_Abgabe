package hashSets;

public class Auto {
	
	private String farbe;
	private String typ;
	
	public Auto (String farbe, String typ){
		this.farbe = farbe;
		this.typ = typ;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	
	public boolean equals (Object o){
		
		if (o == null){
			return false;
		}
		if (o == this){
			return true;
		}
		if (!(o instanceof Auto)){
			return false;
		}
		
		Auto auto = (Auto) o;
		
		if (auto.getTyp() == this.getTyp() && auto.getFarbe() == this.getFarbe()){
			return true;
		}else{
			return false;
		}
	}
	
	

}
