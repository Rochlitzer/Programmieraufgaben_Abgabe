package interfaces;

public class Applikation {
	private Datenbank datenbank;
	
	public Applikation(Datenbank db){this.datenbank = db;}
	
	public void execute(){ datenbank.use();}
	

}
