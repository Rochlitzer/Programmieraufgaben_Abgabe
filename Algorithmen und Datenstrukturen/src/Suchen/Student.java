package Suchen;

import java.util.Scanner;

public class Student extends Person {
	private String matrikelnummer;

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	public void read(){
		
	
	Scanner x = new Scanner(System.in);
	super.read();
	
	System.out.println("Bitte geben Sie die Matrikelnummer ein:");
	String m = x.nextLine();
	setMatrikelnummer(m);

//	
	
	
	
		
	}
	
	public String toString(){String s = "Name: "+ getName()+ " Telefonnummer: "+ getTelefonnummer() + " Geburtsdatum: " + getGeburtsdatum() +" Matrikelnummer: " + getMatrikelnummer();
	return s;}

}
