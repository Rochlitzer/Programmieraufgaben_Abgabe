package interfaces2;

public class Elektromotor implements IMotor {
	
	public void beschleunigen (int gasInProzent){
		System.out.println("Beschleunigung: "+gasInProzent);
	}

}
