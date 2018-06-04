package regularExpressions;

public class StartklasseMailChecker {
	public static void main (String [] args){
		
		MailChecker [] adressen = new MailChecker [7];
		boolean treffer;
		
		adressen [0] = new MailChecker("mail@test.org");
		adressen [1] = new MailChecker("super-student@inf.htwg-konstanz.de");
		adressen [2] = new MailChecker("rookie@inf-sem1.htwg-konstanz.de");
		adressen [3] = new MailChecker("4939@j999.gmx.de");
		adressen [4] = new MailChecker("1@a.net");
		adressen [5] = new MailChecker("mail@5aaa.org");
		adressen [6] = new MailChecker("mail.5aaa.org");
		
		for (int i = 0; i < adressen.length; i++){
			treffer = adressen[i].checkMail();
			System.out.println(treffer);
		}
		boolean richtig;
		MailChecker check = new MailChecker("mail","8929791111111111111");
		richtig = check.checkAnzahl();
		System.out.println(richtig);
	}
}
