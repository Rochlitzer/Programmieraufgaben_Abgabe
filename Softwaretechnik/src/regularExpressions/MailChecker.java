package regularExpressions;

public class MailChecker {
	
	private String mailAdresse;
	private String anzahl;
	
	public MailChecker (String s,String anzahl){
		this.mailAdresse = s;
		this.anzahl = anzahl;
	}
	
	public String getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(String anzahl) {
		this.anzahl = anzahl;
	}

	public MailChecker(String s){
		this.mailAdresse = s;
	}
	
	public void setMailAdresse (String s){
		this.mailAdresse = s;
	}
	
	public String getMailAdresse (){
		return this.mailAdresse;
	}
	
	public boolean checkMail (){
		boolean match = false;
		if (this.mailAdresse.matches("[\\w|-]+[@]+[\\[a-zA-Z][\\w|.|-]*.(de|info|org|net|com)")){
			match = true;}
		return match;
	}
	
	public boolean checkAnzahl(){
		boolean match = false;
		if(this.anzahl.matches("\\d{1,19}")){
			match = true;
		}
		return match;
	}

}
