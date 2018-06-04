package enigma;
import java.util.Scanner;

public class EnigmaStart {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		String Schluessel;
		String Ptext;
		int Walze1; 
		int Walze2;
		int Walze3;
		
		System.out.println("Bitte geben sie die Werte für die 3 Walzen ein");
		
		Walze1 = x.nextInt();
		Walze2 = x.nextInt();
		Walze3 = x.nextInt();
			
		System.out.println("Bitte geben sie nun den Schlüssel ein (3 Zeichen)");
		
		Schluessel = x.nextLine();
		
		
		System.out.println("Bitte geben sie nun den zu verschlüsselnden Text ein");
		
		Ptext = x.nextLine();
		
		
		
		Enigma A = new Enigma (Walze1, Walze2, Walze3, Schluessel);
		
		String B = A.encrypt(Ptext);
		
		System.out.println(B);
		x.close();
		
	}

}
