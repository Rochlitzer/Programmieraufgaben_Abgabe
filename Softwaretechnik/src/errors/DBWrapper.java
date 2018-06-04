package errors;

import java.io.IOException;

public class DBWrapper {

	PoorMansDatabase datenbank;	
	
	public DBWrapper(PoorMansDatabase datenbank) {
		super();
		this.datenbank = datenbank;
	}
	

	public void speichern (int key, String value) throws IOException{
	boolean a = false;	
	int zaehler = 0;
	final int anzahlversuche = 10;
	
	while(a == false){		
		try {
		datenbank.save(key, value);
		a = true;
		System.out.println("Gespeichert: yey :)");
		}
		catch (IOException e){
			System.out.println("Methode konnte nicht aufgerufen werden");
			zaehler++;
			
			if (zaehler == anzahlversuche){
				throw e;
			}
		}
	  }
    }
	
	public String laden(int key) throws IOException{
		boolean a = false;	
		int zaehler = 0;
		final int anzahlversuche = 10;
		String b;
		
		while(a == false){		
			try {
			b = datenbank.load(key);
			a = true;
			System.out.println("Geladen yey :)");
			return b;
			}
			catch (IOException e){
				System.out.println("Methode konnte nicht aufgerufen werden");
				zaehler++;
				
				if (zaehler == anzahlversuche){
					throw e;
				}
			}
		  }
		return ":'(";
	}
}

