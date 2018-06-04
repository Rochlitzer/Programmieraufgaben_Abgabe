package innereklassen;

public class Auto {
	
	public void gibGas (int gewichtaufpedal){
		System.out.println("Beschleunige");
		Motor motor = new Motor();
		motor.spritzufuhr(gewichtaufpedal);
	}
	
	public class Motor{
		
	public void spritzufuhr (int prozentvonmaximal){
		System.out.println("Sprit wird zugef�hrt");
	}
	
	}
}
