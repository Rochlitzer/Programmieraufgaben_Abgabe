package Boersen_Analyse;

public class Start {

	public static void main(String[] args) {
		//double tag1 = 127.5;
		//double kursDiff [] = {-0.5, 2, -1, 1, 3.5, -13, 7, -2, -6, -9, -21, -17, -5, 0.5, 4, -7, -12, 2.5, -3, 2};
		
		double[] kursDiff = new double[20];
		double[] kursReal = new double[kursDiff.length+1];
		StockTickEvent gibKurs = new StockTickEvent();
		double max = 0;
		int kaufen = 0;
		int verkaufen = 0;
		
		
		for(int i = 0 ; i< kursDiff.length; i++){
			kursDiff[i] = (double)Math.round(Math.random() * 60 - 30);
	}

		double tag1 = (double)Math.round(Math.random() * 100 + 500);
		
		kursReal[0] = tag1;
		
	  for(int ii = 1 ; ii < kursReal.length; ii++){
		  
		  gibKurs.setKurs(kursReal[ii-1], kursDiff[ii-1]);
		  
		  kursReal[ii] = gibKurs.getKurs();
		  
	  }
		
	  int max2 = (int) (kursReal[0]/kursReal[1]-1)*100;
	
	  
	  
	  for(int iii = 0 ; iii < kursReal.length; iii++){
		  for(int iiii = iii+1; iiii <kursReal.length; iiii++ ){
			  
			  if( max < (kursReal[iiii]/kursReal[iii]-1)*100){
				  max = (kursReal[iiii]/kursReal[iii]-1)*100;
				  kaufen = iii;
				  verkaufen = iiii;
			  }
			  
		  }  
	  }
	  System.out.println("Der so realisierte Gewinn wäre " + max  +" % vom eingesetzten Betrag gewesen");
	  System.out.println("Ein bester Einkaufstag wäre der "+(kaufen +1) +". Börsentag gewesen");
	  System.out.println("ein dazugehöriger Verkaufstag der "+ (verkaufen +1) +". Börsentag.");
	  
	  for(int q=0; q<kursReal.length; q++ ){
	  System.out.println("der Kurs an Tag "+ (q+1)+ " ist " + kursReal[q]);
	  }
	}	
}	
	