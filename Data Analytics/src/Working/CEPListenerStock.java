package Working;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class CEPListenerStock implements UpdateListener {

	private static final Pattern REG_EX = Pattern.compile(
			"\\{timeStamp=(\\d+\\.\\d+\\.\\d+), symbol=(\\w+), avg\\(price\\)=(\\d+\\.\\d+), price=(\\d+\\.\\d+)\\}");

	EPRuntime cepRTST;

	public CEPListenerStock(EPRuntime cepRTST) {
		this.cepRTST = cepRTST;
	}

	public void update(EventBean[] newData, EventBean[] oldData) {

		String base = newData[0].getUnderlying().toString();
		Matcher m = REG_EX.matcher(base);

		String movAvgTime = newData[0].getUnderlying().toString();
		String movAvgPrice = newData[0].getUnderlying().toString();
		String priceString = newData[0].getUnderlying().toString();
		String symbol = newData[0].getUnderlying().toString();

		if (m.matches()) {
			movAvgTime = m.group(1);
			symbol = m.group(2);
			movAvgPrice = m.group(3);
			priceString = m.group(4);
		}

		double movAvg = Double.parseDouble(movAvgPrice);
		double price = Double.parseDouble(priceString);
		
		
		// Start event generator
		
			StockTickerMain.generateTick(cepRTST, movAvgTime, movAvg, price, symbol);
		}
	}

		

	
