package Stack;

import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner; 

public class Start2 {

	public static void main(String[] args)throws IOException {
	 
	 String text = null;
	 String kommentar = "";
	 int amountOpen = 0;
	 int amountClose = 0;
	 
//Ein Text File einlesen
	        File file = new File("..."); 

	            BufferedReader in = null; 
	        try { 
	            in = new BufferedReader(new FileReader("...")); 
	            String zeile = null; 
	            while ((zeile = in.readLine()) != null) { 
	                System.out.println("Gelesene Zeile: " + zeile); 
	                text += zeile;
	            } 
	        } catch (IOException e) { 
	            e.printStackTrace(); 
	        } finally { 
	            if (in != null) 
	                try { 
	                    in.close(); 
	                } catch (IOException e) { 
	                } 
	        } 
	       // System.out.println(text);
	        for( int i = 0 ; i< text.length()-1; i++){
	        	
	        	if((text.charAt(i) == '/' && text.charAt(i+1) == '*') ){
	        		kommentar = kommentar + text.charAt(i) +  text.charAt(i+1);
	        		amountOpen +=1;
	        		i++;}
	        	else if((text.charAt(i) == '*' && text.charAt(i+1) == '/')){
		        		kommentar = kommentar + text.charAt(i) +  text.charAt(i+1);	
		        		amountClose +=1;
		        		i++;}
	        		
	        	
	        	
	        }
	        
	        	
	        System.out.println("Kommentar: "+ kommentar);
	        	System.out.println("amountOpen" + amountOpen);
	        	System.out.println("amountClose" + amountClose);
	        	
	        	Stack stack = new Stack(amountOpen);
	        	
	        	for(int ii = 0 ; ii <= kommentar.length()-2 ; ii+=2){
	        		if((kommentar.charAt(ii) == '/' && kommentar.charAt(ii+1) == '*')) { stack.push('A');}
	        		else if(stack.returnTop() == 'A' && (kommentar.charAt(ii) == '*' && kommentar.charAt(ii+1) == '/')){stack.pop();}
	        		
	        		}	
	        	if(stack.isEmpty()){System.out.println("Alles Richtig kein fehler bei den Kommentaren");}
	        	
	        	if(stack.isEmpty() == false){System.out.println("Es gibt ein fehler bei den Kommentaren");
	        	for(int aa = 0; aa <= stack.stackArray.length-1 ; aa++){
	        	System.out.println(stack.stackArray[aa]);}}
	        	
	        	}

}
