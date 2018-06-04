package innereklassen;

public class Auto2 {
	
	public void gibGas(int gewichtaufpedal){
		System.out.println("Beschleunige");
		
		class Motor{
			
			public void spritzufuhr (int prozentvonmaximal){
				System.out.println("Sprit wird zugef�hrt");
			}
		}
		
		Motor motor = new Motor ();
		motor.spritzufuhr(gewichtaufpedal);
		
	}

}
