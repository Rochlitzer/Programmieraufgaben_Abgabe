package errors;

public class StartklasseRechnung {
	
	public static int halbiere (int zahl) throws ArithmeticException{
		
		return zahl%2;
			//throw new ArithmeticException();
		//}else{
			//return zahl/2;
		//}	
	}
	
	public static int sicheresHalbieren (int zahl) throws ArithmeticException{
		
		assert zahl%2 == 0 : "Die Zahl muss gerade sein";
		return zahl/2;
	}
	
	public static void main (String [] args){
		
		int ergebnis;
		
		ergebnis = halbiere(5);
		//System.out.println(ergebnis);
		
		//ergebnis = sicheresHalbieren(5);
		System.out.println(ergebnis);
	}

}
