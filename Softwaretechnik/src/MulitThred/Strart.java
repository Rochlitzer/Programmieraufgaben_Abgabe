package MulitThred;

import org.omg.Messaging.SyncScopeHelper;

public class Strart {

	public static void main(String[] args) {
		
		String s1 = "Ich bin Thread 1";
		String s2 = "Ich bin Thread 2";
		String s3 = "Ich bin Thread 3";
		
		AusgabeKlasse a1 = new AusgabeKlasse(s1);
		Thread thread1 = new Thread(a1);
		thread1.start();
		
		
		AusgabeKlasse a2 = new AusgabeKlasse(s2);
		Thread thread2 = new Thread(a2);
		thread2.start();
		
		
		AusgabeKlasse a3 = new AusgabeKlasse(s3);
		Thread thread3 = new Thread(a3);
		thread3.start();
	
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
System.out.println("ich bin fertig");
}
}