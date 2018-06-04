package Suchen;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Student[] arrayStudent = new Student [1];
		
		for(int i = 0; i < 1; i++){
			
			arrayStudent[i] = new Student();
			arrayStudent[i].read();
			
		}
		
		Scanner x = new Scanner(System.in);
			System.out.println("Student suchen: Bitte geben Sie eine Matrtikelnummer ein.");
			
			String mr = x.nextLine();
			int error = 0;
			x.close();
			
		for(int a = 0; a < 1; a++){
			if(mr.equals(arrayStudent[a].getMatrikelnummer())){
				System.out.println(arrayStudent[a].toString());
				break;
			}	
			else { error =+ 1;}
		}
		if(error == arrayStudent.length ){System.out.println("Der Student existiert nicht");
		}
		}

	}


