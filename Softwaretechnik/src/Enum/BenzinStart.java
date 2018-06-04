package Enum;

public class BenzinStart {

	public static void main(String[] args) {
		for(Treibstoff treibstoff : Treibstoff.values()){
			System.out.println(treibstoff.getNameSuper() + "der Sprit hat "+ treibstoff.octan()+ " Octan");
			
		}
	}

}
