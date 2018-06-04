package Stack;


import java.io.BufferedReader; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Scanner; 

public class Start1 {

	 public static void main(String[] args)throws IOException {
		 
		 String text = null;
		 String klammern = "";
		 int amountOpen = 0;
		 int amountClose = 0;
		 
	//Ein Text file einlesen
		        File file = new File("...."); 

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
		        for( int i = 0 ; i<= text.length()-1; i++){
		        	
		        	if(text.charAt(i) == ('(') ^ text.charAt(i) == (')') ^ text.charAt(i) == ('{') ^ text.charAt(i) == ('}')  ^ text.charAt(i) == ('[') ^ text.charAt(i) == (']')){
		        		klammern = klammern + text.charAt(i);
		        		if(text.charAt(i) == ('(') ^ text.charAt(i) == ('{') ^ text.charAt(i) == ('[')){ amountOpen +=1; }
		        		if(text.charAt(i) == (')') ^ text.charAt(i) == ('}') ^ text.charAt(i) == (']')){ amountClose +=1; }
		        	}
		        }
		        
		        	
		        System.out.println("Klammern: "+ klammern);
		        	System.out.println("amountOpen" + amountOpen);
		        	System.out.println("amountClose" + amountClose);
		        	
		        	Stack stack = new Stack(amountOpen);
		        	
		        	for(int ii = 0 ; ii <= klammern.length()-1 ; ii++){
		        		if(klammern.charAt(ii) == '(' ^ klammern.charAt(ii) == '{' ^ klammern.charAt(ii) == '['){ stack.push(klammern.charAt(ii));}
		        		
		        		else if(stack.returnTop() == '(' && klammern.charAt(ii) == ')'){stack.pop();}
		        		else if(stack.returnTop() == '{'  && klammern.charAt(ii) == '}'){stack.pop();}
		        		else if(stack.returnTop()  == '[' && klammern.charAt(ii) == ']'){stack.pop();}
		        		else System.out.println("Es liegt ein Fehler vor die Klammern Passen nicht zusammen \nDie folgende Klammer wurde nicht richtig geschlossen: " + klammern.charAt(ii));
		        		}	
		        	
		        	for(int a = 0; a <= stack.stackArray.length-1 ; a++){
		        		System.out.println(stack.stackArray[a]);
		        	}
	 
	 }
}

		
	


