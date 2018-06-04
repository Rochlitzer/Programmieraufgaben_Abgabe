package hashSets;

public class MySimpleHashSet {
	
	private Auto[] autos = new Auto [5];
	
	
	public Auto[] getAutos() {
		return autos;
	}

	public void setAutos(Auto[] autos) {
		this.autos = autos;
	}

	public MySimpleHashSet(Auto[] autos) {
		super();
		this.autos = autos;
	}


	public void addAuto (Auto a){
		int einfuegeIndex;
		for (int i = 0; i < autos.length; i++ ){
			if (autos[i] == null){
				einfuegeIndex = i;
				autos [einfuegeIndex] = a;
				break;
			}
		}
		
	
	

}}
