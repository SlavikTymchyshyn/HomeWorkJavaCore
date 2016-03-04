package home8;

public class SteeeringWheel {

	private double steerradius;

	public SteeeringWheel(double steerradius) {

		this.steerradius = steerradius;
	}

	public void sportrul() {
		steerradius *= .8;
	}

	public double getSteerradius() {
		return steerradius;
	}

	public void setSteerradius(double steerradius) {
		this.steerradius = steerradius;
	}

	@Override
	public String toString() {
		return ": [steerradius=" + steerradius + "]";
	}

}
