package errors;

import java.io.IOException;

public class StartklasseDatabase {
	public static void main (String [] args) throws IOException{
	//text datei einlesen
	PoorMansDatabase database = new PoorMansDatabase("...");
	DBWrapper test = new DBWrapper(database);
	test.speichern(2,"andi");
	test.laden(2);
	}

}
