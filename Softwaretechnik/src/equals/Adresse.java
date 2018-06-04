package equals;

public class Adresse {
	String empfeänger;
	String straße;
	int plz;
	String ort;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empfeänger == null) ? 0 : empfeänger.hashCode());
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		result = prime * result + plz;
		result = prime * result + ((straße == null) ? 0 : straße.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (empfeänger == null) {
			if (other.empfeänger != null)
				return false;
		} else if (!empfeänger.equals(other.empfeänger))
			return false;
		if (ort == null) {
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		if (plz != other.plz)
			return false;
		if (straße == null) {
			if (other.straße != null)
				return false;
		} else if (!straße.equals(other.straße))
			return false;
		return true;
	}

	
	
	

}
