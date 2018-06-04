package Sortieren;
import java.util.Random;
import java.util.Scanner;

public class Start {
	
	public static void main(String[] args){
	
		
	Scanner scann=new Scanner(System.in);
	
	System.out.println("Wie viele stellen soll der Array haben? ");
	int size = scann.nextInt();
	
	StockTickArray array=new StockTickArray(size);
	
	System.out.println("Wollen Sie den Array nach dem Symbol oder dem Kurs sortieren?");
	System.out.println("_____________________________________________________________________________________________");
	System.out.println("Für das sortieren nach dem Symbol geben Sie die  		*** 1 *** ein.");
	System.out.println("Für das sortieren nach dem Kurs geben Sie die  			*** 2 *** ein.");
	System.out.println("_____________________________________________________________________________________________");	
	int wahl1=scann.nextInt();
	
	
	System.out.println(" ");
	System.out.println("Nach welcher Sortier Methode wollen Sie sortieren?");
	System.out.println("_____________________________________________________________________________________________");
	System.out.println("Für die sequentielle Methode geben Sie die 			*** 3 *** ein.");
	System.out.println("Für die binäre Methode geben Sie die 				*** 4 *** ein.");
	System.out.println("_____________________________________________________________________________________________");
	int wahl2=scann.nextInt();
	
	int wahl3 = wahl1 * wahl2;
	
	
	switch(wahl3)
	{
	case 3:array.sortStockTickArraySymbol();break;
	case 4:array.sortStockTickArrayBinSymbol();break;
	case 6:array.sortStockTickArray();break;
	case 8:array.sortStockTickArrayBin();break;
	default:System.out.println("Falsche Eingabe");
	}
	
}
}
