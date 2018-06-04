package hashSet_treeMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bank {
	
	String name;
	String blz;
	private Set <Kunde> kunden = new HashSet<Kunde>();
	
	public Bank(String name, String blz) {
		this.name = name;
		this.blz = blz;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlz() {
		return blz;
	}

	public void setBlz(String blz) {
		this.blz = blz;
	}

	public void kundeanlegen(Kunde kunde) {
		System.out.println("ich lege den Kunde " + kunde.getName());
		kunden.add(kunde);
		kunde.setBank(this);
		
	}
	public Collection<Kunde> getKunden(){
		return kunden;}
}
