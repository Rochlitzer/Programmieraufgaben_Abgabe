package hashSet_treeMap;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

public class Kunde {

	private String kundennr;
	private String name;
	private Bank bank;
	private SortedMap <String, Konto> konten = new TreeMap <String, Konto>();
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getKundennr() {
		return kundennr;
	}
	public void setKundennr(String kundennr) {
		this.kundennr = kundennr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Kunde (String kundennr,String name ,Bank bank) {
		this.kundennr = kundennr;
		this.name = name;
		this.bank = bank;
	}
	
	public void kontoanlegen(Konto konto) {
		System.out.println("Ich lege ein konto an ");
		konten.put(konto.getKontonr(), konto);
		konto.setKunde(this);};
	
	public void kontoloeschen(Konto konto) {
		System.out.println("Lösche ein Konto ");
		konten.put(konto.getKontonr(), konto);
		konto.setKunde(null);};
		
		public Collection<Konto> getKonto(){
			return konten.values();}
	}


