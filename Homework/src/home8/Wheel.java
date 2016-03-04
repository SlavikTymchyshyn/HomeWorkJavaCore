package home8;

public class Wheel {

	private double wheelradius;

	private int wheelcount;

	public Wheel(double wheelradius, int wheelcount) {
		this.wheelradius = wheelradius;
		this.wheelcount = wheelcount;
	}

	public void sportwheel() {
		wheelradius += 1;
	}

	public double getWheelradius() {
		return wheelradius;
	}

	public void setWheelradius(double wheelradius) {
		this.wheelradius = wheelradius;
	}

	public int getWheelcount() {
		return wheelcount;
	}

	public void setWheelcount(int wheelcount) {
		this.wheelcount = wheelcount;
	}

	@Override
	public String toString() {
		return ": [wheelradius=" + wheelradius + ", wheelcount=" + wheelcount
				+ "]";
	}

}
