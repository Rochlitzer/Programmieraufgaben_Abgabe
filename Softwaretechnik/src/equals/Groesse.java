package equals;


public class Groesse {

	int länge;
	int breite;
	int höhe;
	float gewicht;
	
	public boolean equals(Object o){
		if (o == null){return false;}
		if (o == this){return true;}
		if (!(o instanceof Groesse )){ return false;}
		
		Groesse andereGroesse = (Groesse)o;
		if( andereGroesse.breite == this.breite || andereGroesse.höhe == this.höhe  || andereGroesse.länge == this.länge || andereGroesse.gewicht == this.gewicht){return true;}
		
		return false;
		
	}
}
