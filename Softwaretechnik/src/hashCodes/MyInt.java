package hashCodes;

public class MyInt {
	
	private int i;

	public MyInt(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public int hashCode(){
		
		int hash;
		hash = i % 10000;
		return hash;
	}
	

}
