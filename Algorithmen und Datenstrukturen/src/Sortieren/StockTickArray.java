package Sortieren;


import java.util.Scanner;

public class StockTickArray {
	
		private StockTick[] a;
		private int size;
		
		String[] name = { "AMZN", "IBM", "CSCO", "HPQ", "GOOG", "ORCL", "BABA", "AAPL", "SAP", "MSFT" };
		
		public static double amountSeq = 0;
		public static double amountBin = 0;


		// Constructor

		public StockTickArray(int size) {

			this.size = size;
			a = new StockTick[size];
			
			System.out.println("Unsortiert: ");

			for (int i = 0; i < size; i++) {
				
				int firma = (int) (Math.random() * 10);
				int kurs = (int) (Math.random() * 20) + 60;
				
				a[i] = new StockTick(name[firma], kurs);
				
				System.out.println(a[i].print());

//				System.out.println("Stelle: " + i + ": " + random + " hat den Kurs " + kurs);
			}
		}

		// LessThan Methoden:
		
		public boolean lessthan(StockTick x, StockTick y) {

			if (x.getKurs() < y.getKurs()) {
				return true;
			}
			return false;
		}

		public boolean lessthanSymbol(StockTick x, StockTick y) {
			int vergleich;

			vergleich = x.getSymbol().compareTo(y.getSymbol());

			if (vergleich < 0) {
				return true;
			}

			else return false;
		}

		public boolean lessthanSymbolString(String x, StockTick y) {
			int vergleich;

			vergleich = x.compareTo(y.getSymbol());

			if (vergleich < 0) {
				return true;
			}

			else return false;
		}

		
		
		// Sequentielle Suche
		// Kruswerte
		public void sortStockTickArray() {
			int i, j;
			int amount1 = 0;

			StockTick x = new StockTick();

			for (i = 1; i < size; i++) {
				x = a[i];

				j = i;

				while (j > 0 && lessthan(x, a[j - 1])) {
					a[j] = a[j - 1];
					amount1++;
					amountSeq++;
					j--;
				}
				a[j] = x;
			}

			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Sortiert nach Kurswert sequentiell: ");
			for (int in = 0; in < a.length; in++) {
				System.out.println(a[in].print());
			}
			System.out.println("Benötigte Versuche: " + amount1);

		}
		
		// Symbol
		public void sortStockTickArraySymbol() {
			int i, j;
			int amount2 = 0;

			StockTick x = new StockTick();

			for (i = 1; i < size; i++) {
				x = a[i];

				j = i;

				while (j > 0 && lessthanSymbol(x, a[j - 1])) {
					a[j] = a[j - 1];
					amount2++;
					j--;
				}
				a[j] = x;
			}

			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Sortiert nach Symbol sequentiell: ");
			for (int in = 0; in < a.length; in++) {
				System.out.println(a[in].print());
			}
			System.out.println("Benötigte Versuche: " + amount2);
		}

		// Binäre Suche
		public void sortStockTickArrayBin() {
			int i, j, left, right, m;
			int amount3 = 0;

			StockTick x = new StockTick();

			for (i = 1; i < size; i++) {

				x = a[i];
				left = 0;
				right = i - 1;

				while (left <= right) {
					m = (left + right) / 2;
					if (lessthan(x, a[m])) {
						right = m - 1;
					} else {
						left = m + 1;
					}
					amount3++;
					amountBin++;
				}
				for (j = i - 1; j >= left; j--) {
					a[j + 1] = a[j];

				}
				a[left] = x;

			}

			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Sortiert nach Kurswert binär: ");
			for (int in = 0; in < a.length; in++) {
				System.out.println(a[in].print());
			}
			System.out.println("Benötigte Versuche: " + amount3);
		}

		public void sortStockTickArrayBinSymbol() {
			int i, j, left, right, m;
			int amount4 = 0;

			StockTick x = new StockTick();

			for (i = 1; i < size; i++) {

				x = a[i];
				left = 0;
				right = i - 1;

				while (left <= right) {
					m = (left + right) / 2;
					if (lessthanSymbol(x, a[m])) {
						right = m - 1;
					} else {
						left = m + 1;
					}
					amount4++;
				}
				for (j = i - 1; j >= left; j--) {
					a[j + 1] = a[j];

				}
				a[left] = x;

			}

			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("Sortiert nach Symbol binär: ");
			for (int in = 0; in < a.length; in++) {
				System.out.println(a[in].print());
			}
			System.out.println("Benötigte Versuche: " + amount4);
		}

		// Sortier Check

		public boolean check() {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].getKurs() > a[i + 1].getKurs()) {
					return false;
				}
			}
			return true;
		}

		// Binäre Suche

		public void binaereSuche(int links, int rechts, String schluessel) {

			int m;


				while (links <= rechts) {
					m = (links + rechts) / 2;

			
					if (schluessel.compareTo(a[m].getSymbol()) !=0){
						rechts = m - 1;
					if (schluessel.equals(a[rechts].getSymbol())) {
							System.out.println("Der Gesuchte Wert liegt auf Position: " + (rechts));
					}
					else {
						links++ ;
					} 
				}
				
				} System.out.println("Nicht vorhanden!");
		}
		

}
