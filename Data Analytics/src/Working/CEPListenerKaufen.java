package Working;

import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class CEPListenerKaufen implements UpdateListener {

	public void update(EventBean[] newData, EventBean[] oldData) {
		
		System.out.println("");
		System.out.println("*****************************************************************");
		System.out.println("Kaufen: " + newData[0].getUnderlying());  
		System.out.println("*****************************************************************");
        System.out.println("");
        
        
   }

}