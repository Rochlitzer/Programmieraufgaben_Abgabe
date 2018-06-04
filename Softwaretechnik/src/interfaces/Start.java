package interfaces;

public class Start {

	public static void main(String[] args) {
		
		Applikation a = new Applikation(new Oracle());
		
		a.execute();

	}

}
