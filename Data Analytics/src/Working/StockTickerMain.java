package Working;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.jws.WebResult;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

public class StockTickerMain {

	private static Random generator = new Random();

	public static void main(String[] args) throws IOException {


		// Configuration Engine I
		Configuration cepConfigST = new Configuration();
		cepConfigST.addEventType("StockTick", Tick.class.getName());
		EPServiceProvider cepST = EPServiceProviderManager.getProvider("myCEPEngineI", cepConfigST);
		EPRuntime cepRTST = cepST.getEPRuntime();
		EPAdministrator cepAdmST = cepST.getEPAdministrator();

		
		// Configuration Engine II
		Configuration cepConfigMA = new Configuration();
		cepConfigMA.addEventType("StockTickMA", TickMA.class.getName());
		EPServiceProvider cepMA = EPServiceProviderManager.getProvider("myCEPEngineII", cepConfigMA);
		EPRuntime cepRTMA = cepMA.getEPRuntime();
		EPAdministrator cepAdmMA = cepMA.getEPAdministrator();
		
		

		// Create EPL Statement Komplexes Event-> Berechnet den 200 Tagesdurchschnitt und ruft den Listener zur erzeugung des Komplex Event ab.
		EPStatement cepStatementST = cepAdmST
				.createEPL("select symbol, price, avg(price), timeStamp from "
						+ "StockTick(symbol='DAX').win:length(200)");
		
		// Add Listener
		cepStatementST.addListener(new CEPListenerStock(cepRTMA));
		
		
		
		// Create EPL Statement Kaufen 1-> Initiales Kauf ereigniss wird nur eimal ausgelößt.
		EPStatement cepStatementMA = cepAdmMA.createEPL(
				"select a.symbol, a.movAvg, a.timeStamp, a.price from "
				+ "pattern[a = StockTickMA(a.price > (a.movAvg*1.01))]");
				
		// Add Listener
		cepStatementMA.addListener(new CEPListenerKaufen());
		
		
		
		// Create EPL Statement Kaufen 2 
		EPStatement cepStatementMA1 = cepAdmMA.createEPL(
				"select b.symbol, b.movAvg, b.timeStamp, b.price from "
				+ " pattern [every (a = StockTickMA(a.price < (a.movAvg/1.01)) ->  b = StockTickMA(b.price > (b.movAvg*1.01))) ]");
				
		// Add Listener
		cepStatementMA1.addListener(new CEPListenerKaufen());
		

		
		// Create EPL Statement Verkaufen
				EPStatement cepStatementMA2 = cepAdmMA.createEPL(
						"select b.symbol, b.movAvg, b.timeStamp, b.price from "
						+ " pattern [every (a = StockTickMA(a.price > (a.movAvg*1.01)) -> b = StockTickMA(b.price < (b.movAvg/1.01))) ]");
						
				// Add Listener
				cepStatementMA2.addListener(new Verkaufen());

				//Generate StockTicks 
				
					generateRandomTick(cepRTST);		}

	
	
	
	// Tick Event Generator
	public static void generateRandomTick(EPRuntime cepRTST) throws IOException {
		FinancialData dax = new FinancialData("GDAXV.csv");
		Kurswert[] k = dax.getData();

		for (int i = 0; i < k.length; i++) {

			double p = k[i].getValue();
			String t = k[i].getKey();
			String s = "DAX";
			Tick tick = new Tick(s, p, t);
			
			//System.out.println("Sending tick normal:" + tick);
			cepRTST.sendEvent(tick);

		}
	}
	
	
	
	// TickMA Event Generator
	public static void generateTick(EPRuntime cepRTMA, String timeStamp, double movAvg, double price, String symbol) {
		TickMA tick = new TickMA(symbol, movAvg, timeStamp, price);
		
		try {
		    Thread.sleep(400);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println("Sending tick average:" + tick);
		cepRTMA.sendEvent(tick);
	}
}
// End of Class