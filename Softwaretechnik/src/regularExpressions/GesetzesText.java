package regularExpressions;

import java.io.*;
import java.util.regex.*;

public class GesetzesText {
	public static void main (String[] args)throws FileNotFoundException{
		
		String text = "";
		Reader lesen = null;
		//Text einlesen
		java.io.File gesetzesText = new java.io.File ("...");
		System.out.println(gesetzesText.getAbsolutePath());
		
		if (gesetzesText.exists()&& gesetzesText.canRead()){
			System.out.println("Datei existiert und kann gelesen werden");
		}
		try {
			
		lesen = new FileReader (gesetzesText);
		for (int i;(i = lesen.read()) !=-1;)
			text = text + (char)i;
		
		/*worte mit kleinbuchstaben zwischen 3 und 20 Buchstaben finden
		Pattern kleinbuchstabe = Pattern.compile("\\s+[a-z]{3,20}");
		Matcher matcher1 = kleinbuchstabe.matcher(text);
		while (matcher1.find()){ 					// find() gibt an ob im untersuchten String der regex gefunden wurde
			System.out.println(matcher1.group());	// group() gibt die gefunden Substrings aus
		}*/
		
		//runde Klammer durch eckige ersetzen (2) => [2]
		text = text.replaceAll("(2)", "[2]");
		Pattern klammern = Pattern.compile("\\[2\\]");
		Matcher matcher = klammern.matcher(text);
		while(matcher.find()){// find() gibt an ob im untersuchten String der regex gefunden wurde
			System.out.println(matcher.group());// group() gibt die gefunden Substrings aus
		}
		}catch (IOException e){
			System.out.println("Datei konnte nicht bearbeitet werden");
		}
	}	
}
