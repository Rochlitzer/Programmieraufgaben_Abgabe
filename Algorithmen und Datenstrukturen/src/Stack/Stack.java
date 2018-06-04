package Stack;

public class Stack {
	public int top;
	public char[] stackArray;
	
	
	public Stack(int i) {
		this.stackArray = new char[i];
		this.top = -1;
	}
	
	public void push(char i){
		if(isFull() == false){
		
		top += 1;
		stackArray[top]= i;}
		else System.out.println("Einfügen nicht möglich da Stack voll");
		}

	
	
	public char pop(){
		if(isEmpty() == false){
			
		char a = stackArray[top];
		stackArray[top] = '\u0000';
		top -= 1;
		return a;}
		else System.out.println("Löschen nicht möglich da Stack leer"); return 9; 
		
	}
	
	public boolean isEmpty(){
		if(top == -1){
		return true;
		}
		else return false;
	}
	
	public boolean isFull() {
		if(top == stackArray.length-1){
		 return true;
		 }
		else return false;
	 }
	
	public char returnTop(){
		if(isEmpty() == false){
		return stackArray[top];
		}
		return 9;
	}
}
