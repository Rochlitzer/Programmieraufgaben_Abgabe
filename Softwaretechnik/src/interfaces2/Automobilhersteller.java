package interfaces2;

public class Automobilhersteller {
	public static void main (String [] args){
		Verbrennungsmotor diesel = new Verbrennungsmotor();
		Auto vw = new Auto (diesel);
	}
}
