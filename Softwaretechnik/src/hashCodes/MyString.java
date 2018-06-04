package hashCodes;

public class MyString {
	
	private String s;

	public MyString(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public int hashCode(){
		
		int hashwert = 0;
		
		for (int i = 0; i < s.length(); i++){
			hashwert = hashwert + s.charAt(i) * (i+1);
		}
		
		return hashwert;
	}	
}
