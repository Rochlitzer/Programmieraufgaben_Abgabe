package JavaDocs;

import java.util.Scanner;
public class StartklasseRechnen {
	public static void main (String [] args){
		int zufallszahl;
		Rechnung rechnung = new Rechnung();
		int a,b,c;
		int eingabe = 0;
		
		while (eingabe == 0){
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie drei Zahlen ein");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		try {
		zufallszahl = rechnung.getZufallszahl(a,b,c);
		System.out.println("Die Zahl ist "+zufallszahl);
		System.out.println("Möchten Sie die Methode erneut ausführen? Dann drücken Sie 0, zum Beenden der Anwendung die 1");
		eingabe = s.nextInt();
		}
		catch (IllegalArgumentException e){
			System.out.println("Keine gültigen Argumente");
			//e.printStackTrace();
			System.out.println("Möchten Sie die Methode erneut ausführen? Dann drücken Sie 0; zum Beenden der Anwendung die 1");
			eingabe = s.nextInt();
		}
		s.close();
		}
	}

}
