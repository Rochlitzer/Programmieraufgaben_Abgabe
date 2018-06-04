package enigma;

public class Walze {
final String Walze50 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
final String Walze51 ="ADCBEHFGILJKMPNOQTRSUXVWZY";
final String Walze60 ="ACEDFHGIKJLNMOQPRTSUWVXZYB";
final String Walze61 ="AZXVTRPNDJHFLBYWUSQOMKIGEC";
final String Walze70 ="AZYXWVUTSRQPONMLKJIHGFEDCB";
final String Walze71 ="AEBCDFJGHIKOLMNPTQRSUYVWXZ";
int WalzenNr;
final String a;


//Constuctor der Klasse wird immer Ausgeführt

	public Walze (int n){
		
//		System.out.println(n);
		
		
	this.WalzenNr = n;
	
	switch (WalzenNr)
	{
	case 50: this.a = Walze50; break;
	case 51: this.a = Walze51; break;
	case 60: this.a = Walze60; break;
	case 61: this.a = Walze61; break;
	case 70: this.a = Walze70; break;
	case 71: this.a = Walze71; break;
	default: this.a = ""; break;
	}
//	System.out.println(a);
}



// Instanzmehode der Klasse 

public int countClockwiseRotations(char Start, char Ziel){
	int diff = 0;
	int s= 0;
	int z = 0;
	
	
	for (int i = 0; i < a.length(); ++i ){
		
		if (Start == a.charAt(i))
		{s = i;}
	}
		
	for (int ii = 0;ii < a.length(); ++ii ){
			
			if (Ziel == a.charAt(ii))
			{z = ii;}	
	}
	
	if (s<z){
		diff = z-s;
//		System.out.println(diff);
		return diff;
	}
		
	else if (s>z){
		diff = 26 - s + z;
//		System.out.println(diff);
		return diff;
	}	
	
	else return diff;
	}	

//Instanzmehode der Klasse2 
public int countCounterClockwiseRotations(char Start, char Ziel){
	
	int diff = 0;
	int s= 0;
	int z = 0;
	
	
	for (int i = 0; i < a.length(); ++i ){
		
		if (Start == a.charAt(i))
		{
		s = i;}
//				System.out.println(s);}
	}
	for (int ii = 0;ii < a.length(); ++ii ){
			
			if (Ziel == a.charAt(ii))
			{
			z = ii;}
//			System.out.println(z);}	
	}
	
	if (z>s){
		diff = z-s;
//		System.out.println(diff);
		return diff;
	}
		
	else if (z<s){
		diff = 26 - s + z;
//		System.out.println(diff);
		return diff;
	}	
	
	else return diff;
	}	

// Methode die einen String zurückliefert Läuft mit dem Uhrzeigersinn 

public char rotateClockwise(char c, int b){
	char buchstabe = 'A';
	char B3 = c;
	int B2 = b;
	
	for (int i = 0 ; i < 26; ++i){
		
		int count = i;
		
		int c1 = B2 + count;
		
		if(c1 < 26 && B3 == a.charAt(count)){
			buchstabe = a.charAt(c1);
//			System.out.println(buchstabe);
			return buchstabe;}
		
		if(c1 > 26 && B3 == a.charAt(count)){
			buchstabe = a.charAt(c1 - 26 );
//			System.out.println(buchstabe);
			return buchstabe;}
	}  return buchstabe;}

//Methode die einen String zurückliefert Läuft gegen den Uhrzeigersinn 	
public char rotateCounterClockwise(char c, int b){
	char buchstabe = 'A';
	char B3 = c;
	int B2 = b;
	
	for (int i = 0 ; i < 26; ++i){
		
		int count = i;
		
		int c1 = count - B2;
		
		if(c1 > 0 && B3 == a.charAt(count)){
			buchstabe = a.charAt(c1);
//			System.out.println(buchstabe);
			return buchstabe;}
		
		if(c1 < 0 && B3 == a.charAt(count)){
			buchstabe = a.charAt(c1 + 26 );
//			System.out.println(buchstabe);
			return buchstabe;}
	}  return buchstabe;}
	 
}

