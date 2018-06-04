package Sortieren;

import java.util.Scanner;

public class Start2 {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		
		System.out.println("Wie viele stellen soll der Array haben?");
		int size = scann.nextInt();
		
		
		System.out.println("Nach welcher Sortier Methode wollen Sie die Kurswerte sortieren?");
		System.out.println("_____________________________________________________________________________________________");
		System.out.println("Für die sequentielle Methode nach Kurs geben Sie die 		*** 1 *** ein.");
		System.out.println("Für die binäre Methode nach Kurs geben Sie die 			*** 2 *** ein.");
		System.out.println("_____________________________________________________________________________________________");	
		int wahl1=scann.nextInt();
		
		int zaehler=0;
		
	while(zaehler<=1000){
		
		StockTickArray array=new StockTickArray(size);
		if(wahl1==1){
			array.sortStockTickArray();
			zaehler++;
		} else if(wahl1==2){
			array.sortStockTickArrayBin();
			zaehler++;
		} 
	}
		
	if(wahl1==1){
		double zahl= StockTickArray.amountSeq;
		System.out.println("Durchschnittlich wurden: "+zahl/100+" Sortiervorgänge benötigt");
	}else if(wahl1==2){
		double zahl= StockTickArray.amountBin;
		System.out.println("Durchschnittlich wurden: "+zahl/100+" Sortiervorgänge benötigt");
	}
		
		
	}

}
