package enigma;
import java.util.Scanner;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner x = new Scanner(System.in);
				
				String Schluessel;
				String Ptext;
				int Walze1; 
				int Walze2;
				int Walze3;
				int VerEnt;
				System.out.println("Bitte geben sie die Werte für die 3 Walzen ein");
				
				Walze1 = x.nextInt();
				Walze2 = x.nextInt();
				Walze3 = x.nextInt();
					
				System.out.println("Bitte geben sie nun den Schlüssel ein (3 Zeichen)");
				
				Schluessel = x.next();
				
				System.out.println("Wollen Sie Verschlüsseln oder Entschlüsseln ? 1 = Verschlüsseln 2 = Entschlüsseln");
				
				VerEnt = x.nextInt();
				
				
				System.out.println("Bitte geben sie nun den zu verschlüsselnden Text ein");
				
				Ptext = x.next();
			
				x.close();
				
				Enigma A = new Enigma (Walze1, Walze2, Walze3, Schluessel);
				
				String B;
				switch (VerEnt)
				{
				case 1: B = A.encrypt(Ptext);break;
				case 2: B = A.decrypt(Ptext);break;
				default: B = " "; break;
				}
				
				
				System.out.println(B);
				x.close();
				
			}

		}

