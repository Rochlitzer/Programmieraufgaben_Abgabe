package hashSet_treeMap;

public class StartBank {

	public static void main(String[] args) {
		Bank sparkasse = new Bank("Sparkasse", "1234");
		Kunde paul = new Kunde("12345", "Paul", sparkasse);
		Kunde lisa = new Kunde("54321", "Lisa", sparkasse);
		Konto kp = new Konto("33", 1000, paul);
		Konto kl = new Konto("34", 1000, lisa);
		
		
		sparkasse.kundeanlegen(paul);
		sparkasse.kundeanlegen(lisa);
		paul.kontoanlegen(kp);
		paul.kontoanlegen(kl);
		
		System.out.println(paul.getKonto());
		
		for(Kunde kunde: sparkasse.getKunden())
		System.out.println("Wir haben folgende Kunden " + kunde.getName());
		

			
	
	}

}
