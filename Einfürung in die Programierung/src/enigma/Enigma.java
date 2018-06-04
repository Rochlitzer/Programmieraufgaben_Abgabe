package enigma;

public class Enigma {
	
	private Walze[] Walze;
	private String Schlüssel;
	
	
	
	
	
	
	
	// Das ist der Constuktor
	
	
	Enigma(int w1,int w2,int w3, String schlüssel2) {
		
		this.Walze = new Walze [3];
		Walze W1 = new Walze(w1);
		Walze W2 = new Walze(w2);
		Walze W3 = new Walze(w3);
		
		
		
		Walze [0] = W1;
		Walze [1] = W2;
		Walze [2] = W3;
		
		this.Schlüssel =schlüssel2;
//		//System.out.println(Schlüssel);
//		System.out.println(w1);
//		System.out.println(w2);
//		System.out.println(w3);
	}
		

	

	


	public String encrypt(String a){
		
		char[] encrypt = new char[a.length()];
		char CW3 = 0;
		
		String encrypt1;
		
		for(int i= 0; i < a.length(); i++){
			
			if ( i % 2 != 0 ){
				
				char Ziel2 = a.charAt(i);
				int diff = Walze[1].countCounterClockwiseRotations(Schlüssel.charAt(1), Ziel2);
//				System.out.println(diff);
//				System.out.println(Schlüssel.charAt(2));
				CW3 = Walze[2].rotateCounterClockwise(Schlüssel.charAt(2), diff);
			}
			else if ( i % 2 == 0 ){

				char Ziel1 = a.charAt(i);
				int diff = Walze[0].countClockwiseRotations(Schlüssel.charAt(0), Ziel1);
//				System.out.println(diff);
//				System.out.println(Schlüssel.charAt(2));
				CW3 = Walze[2].rotateClockwise(Schlüssel.charAt(2), diff);
				
		}
			encrypt[i] = CW3;
		}
		
		encrypt1 = new String (encrypt);
		
		return encrypt1;}


public String decrypt(String a){
	
	char[] encrypt = new char[a.length()];
	char CW3 = 0;
	
	String decrypt1;
	
	for(int i= 0; i < a.length(); i++){
		
		if ( i % 2 != 0 ){
			
			char Ziel2 = a.charAt(i);
			int diff = Walze[2].countCounterClockwiseRotations(Schlüssel.charAt(2), Ziel2);
//			System.out.println(diff);
//			System.out.println(Schlüssel.charAt(2));
			CW3 = Walze[1].rotateCounterClockwise(Schlüssel.charAt(1), diff);
		}
		else if ( i % 2 == 0 ){

			char Ziel1 = a.charAt(i);
			int diff = Walze[2].countClockwiseRotations(Schlüssel.charAt(2), Ziel1);
//			System.out.println(diff);
//			System.out.println(Schlüssel.charAt(2));
			CW3 = Walze[0].rotateClockwise(Schlüssel.charAt(0), diff);
			
	}
		encrypt[i] = CW3;
	}
	
	decrypt1 = new String (encrypt);
	
	return decrypt1;}
}
