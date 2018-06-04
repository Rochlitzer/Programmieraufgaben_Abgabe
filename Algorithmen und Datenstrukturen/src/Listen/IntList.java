package Listen;

public class IntList {
	public Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public IntList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	// Hinzufügen am Ende der Liste

	public void addTail(int a) {

		Node xnode = new Node(a);
		if (head == null) {
			head = xnode;
		}

		else {
			Node t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = xnode;
		}
	}

	// Löschen und Ausgeben

	public Object getDeleteHead() {
		Object t = head.value;
		head = head.next;
		return t;
	}

	// Ausgabe der List
	public void traverseList() {
		for (Node t = head; t != null; t = t.next) {
			System.out.print(t.value + " ");
		}

	}

	
	public static void listInsert(IntList list1, IntList list2) {

		//Hilfs Variable mit den Werten von Liste1
		Node list1unsotiert = list1.head;

		// Einfügen des ersten werten aus der ErstenListe in die Zweite Liste
		list2.head = new Node(list1.head.value);
		
		

		while (list1unsotiert.next != null) {
			
			//Springe einen schritt weiter
			list1unsotiert = list1unsotiert.next;
			Node hvSortieren = list2.head;

			// Wenn wir am ende der der Liste ankommen und nur noch ein wert übrig ist  
			
			if (hvSortieren.next == null) {
				if (list1unsotiert.value < hvSortieren.value) {
					
					list2.head = new Node(list1unsotiert.value);
					list2.head.next = new Node(hvSortieren.value);
				} else {
					hvSortieren.next = new Node(list1unsotiert.value);
				}
			} else {
				
				// Wenn wert aus der Unsortieren list kleiner ist als Head der 2.Liste
				if (list1unsotiert.value < list2.head.value) {
					//Element vorne anfügen
					Node jetztZweiter = list2.head;
					Node jetztErster = new Node(list1unsotiert.value);
					list2.head = jetztErster;
					jetztErster.next = jetztZweiter;

				} else {
					
					//falls das element Größer ist als der Kopf
					boolean isSorted = false;
					Node zwischenNode = hvSortieren;
					hvSortieren = hvSortieren.next;

					// normale tauschlogik die gesamte liste durch gehen und schauen wenn der unsortite wert kleiner ist und dann einfügen 
					while (hvSortieren != null) {
						if (hvSortieren.value > list1unsotiert.value) {
							Node newValue = new Node(list1unsotiert.value);
							zwischenNode.next = newValue;
							newValue.next = hvSortieren;
							isSorted = true;
							break;

						}
						// einen schritt weiter Springen
						zwischenNode = hvSortieren;
						hvSortieren = hvSortieren.next;
					}
					
					// Falls der Unsortierte wert der Größte ist und am ende des Sortieren angefügt werden muss
					
					if (isSorted == false) {
						zwischenNode.next = new Node(list1unsotiert.value);
					}
				}
			}
		}

	}

	
	
	
	
	public static void listInsert2(IntList list1, IntList list2) {

		Node list1unsotiert = list1.head;

		list2.head = new Node(list1.head.value);

		while (list1unsotiert.next != null) {
			list1unsotiert = list1unsotiert.next;
			Node hvSortieren = list2.head;
			while (hvSortieren != null) {

				hvSortieren.next = new Node(list1unsotiert.value);

				boolean isSorted = false;
				Node zwischenNode = hvSortieren;
				hvSortieren = hvSortieren.next;

				if (list1unsotiert.value < hvSortieren.value) {
					Node newValue = new Node(list1unsotiert.value);
					zwischenNode.next = newValue;
					newValue.next = hvSortieren;
					isSorted = true;
					break;

				}
				zwischenNode = hvSortieren;
				hvSortieren = hvSortieren.next;
			}
		}
	}
}
