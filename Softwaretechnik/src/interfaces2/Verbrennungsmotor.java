package interfaces2;

public class Verbrennungsmotor implements IMotor {

	public void beschleunigen (int gasInProzent){
		System.out.println("Beschleunigung: "+gasInProzent);
	}
}
