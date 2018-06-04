package errors;

import java.util.Scanner;

public class StarteException {
	public static void main (String [] args){ //throws DivisionNullException{	
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		try {
			int c = dividieren(a, b);
			System.out.println(c);
		}catch(DivisionNullException e){
		System.out.println("meine exception");}
		finally{
		System.out.println("geiles Programm");
	}	
		System.out.println("---");
}
	public static int dividieren (int a, int b)throws DivisionNullException{
		if (b != 0){
			int c = a/b;
			return c;
		}else{throw new DivisionNullException();}
	}
	
	
}	
