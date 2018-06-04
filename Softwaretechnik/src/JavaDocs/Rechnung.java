package JavaDocs;

public class Rechnung {

	/* Der Methode werden drei Integer Zahlen als Parameter übergeben
	 * und sie gibt zufällig eine davon zurück.
	 * @param a: erste Zahl
	 * @param b: zweite Zahl
	 * @param c: dritte Zahl
	 * @return: eine der drei Parameter
	 * @throws: IllegalArgumentException, wenn a < b
	 */
	public int getZufallszahl (int a, int b, int c) throws IllegalArgumentException { 
		int zufall = (int)(Math.random()*3);
		
		if (a < b){
			throw new IllegalArgumentException();
		}else{
		
		if (zufall == 0){
			return a;
		}
		
		if (zufall == 1){
			return b;
		}
		
		if (zufall == 2){
			return c;
		}
	}
		return -1;
		
	}
}
