package home8;

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
	public String toString() {
		return ": [Volume=" + Volume + ", Type is " + Type + ", CylinderCount="
				+ CylinderCount + "]";
	}

}
