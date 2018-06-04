package Working;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


public class FinancialData {

	private File file;

	public FinancialData(String path) throws FileNotFoundException {
		this.file = new File(path);
	}

	public Kurswert[] getData() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		String content ="";
		while ((line=br.readLine()) != null){
			content+=line;
		}
		String[] entries = content.split(";");
		Kurswert[] KurswertArray = new Kurswert[entries.length / 2];
		int c = 0;
		for (int CurrentEntry = 0; CurrentEntry < entries.length/2; CurrentEntry++) {
			KurswertArray[CurrentEntry] = new Kurswert(entries[c], Double.parseDouble(entries[c+1]));
			c=c+2;
		}
		return KurswertArray;
	}
}