package MulitThred;

public class AusgabeKlasse extends Thread {
	String a;
	
	public AusgabeKlasse(String a) {
		this.a = a;
		
	}
	
	public void run() {
		
		for(int i = 0; i <= 10 ;i++) {
			
			int w = (int)Math.random() * (1000) + 1000;
			
			System.out.println(a);
		try {
			Thread.sleep(w);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
	}

}
