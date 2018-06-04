package Suchen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	private String name;
	private String telefonnummer;
	private String geburtsdatum;

	public void setName(String name) {
		this.name = name;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		String gb = geburtsdatum;
		boolean i = false;
		
		do{
		if (dateTest(gb)){
		this.geburtsdatum = geburtsdatum;
		i = true;
		 }
		else System.out.println("Bitte geben sie des Geburtsdatum ein:");
		Scanner y = new Scanner(System.in);
		gb = y.nextLine();
		
		} while(i == false);
	}

	public String getName() {
		return name;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void read() {
		Scanner x = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Namen ein:");
		String n = x.next();
		setName(n);
		System.out.println("Bitte geben Sie die Telefonnummer ein:");
		String t = x.next();
		setTelefonnummer(t);
		System.out.println("Bitte geben Sie das Geburtstag ein:");
		String g = x.next();
		setGeburtsdatum(g);
		
		
		
		
	}

	public boolean dateTest(String geburtsdatum2) {
		

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Date d = null;

		try {
			d = format.parse(geburtsdatum2);
		} catch (ParseException ex) {
		 System.out.println("Der Geburtstag hat kein gültiges Format. Bitte wie folgt eingeben dd/MM/yyyy");
		 return false;
		}
		return true;
	}
	
	public String toString()
	{ String s = "Name: "+ getName()+ " Telefonnummer: "+ getTelefonnummer() + " Geburtsdatum: " + getGeburtsdatum();
	return s;}
}
