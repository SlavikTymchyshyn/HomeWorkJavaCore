package home10list;

public class Engine {
	
	private String Volume;

	private String Type;

	private int CylinderCount;

	public Engine(String volume, String type, int cylinderCount) {
		Volume = volume;
		Type = type;
		CylinderCount = cylinderCount;
	}

	public String getVolume() {
		return Volume;
	}

	public void setVolume(String volume) {
		Volume = volume;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getCylinderCount() {
		return CylinderCount;
	}

	public void setCylinderCount(int cylinderCount) {
		CylinderCount = cylinderCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CylinderCount;
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((Volume == null) ? 0 : Volume.hashCode());
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
		Engine other = (Engine) obj;
		if (CylinderCount != other.CylinderCount)
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (Volume == null) {
			if (other.Volume != null)
				return false;
		} else if (!Volume.equals(other.Volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [Volume=" + Volume + ", Type is " + Type + ", CylinderCount="
				+ CylinderCount + "]";
	}

}
