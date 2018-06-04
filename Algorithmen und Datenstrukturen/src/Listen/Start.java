package Listen;

public class Start {

	public static void main(String[] args) {

		// Intizalisiren der Liste
		IntList l1 = new IntList();
		IntList l2 = new IntList();
	

		// befüllen der Liste mit random Werten

		for (int i = 0; i <= 20; i++) {

			l1.addTail((int) (Math.random() * 20) + 10);
		}

		System.out.println("Ausgabe der Unsortierten Liste: ");
		// Ausgabe der Unsortierten Liste
		l1.traverseList();
		System.out.println();
		
		IntList.listInsert(l1, l2);
		
		System.out.println("Ausgabe der Sortierten Liste: ");
		l2.traverseList();
	}

}
