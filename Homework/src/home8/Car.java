package home8;

public class Car {

	private Engine engine;

	private Body body;

	private Wheel wheel;

	private SteeeringWheel steeeringWheel;

	private String Manufacturer;

	private String Model;

	public Car(String Volume, String Type, int CylinderCount,
			String numberbody, String color, double weight, Wheel wheel,
			SteeeringWheel steeeringWheel,
			// double wheelradius, int count, double steerradius,
			String manufacturer, String model) {
		this.engine = new Engine(Volume, Type, CylinderCount);
		this.body = new Body(numberbody, color, weight);
		this.wheel = wheel;
		this.steeeringWheel = steeeringWheel;
		Manufacturer = manufacturer;
		Model = model;
	}

	public void Changediametrykoles(double newwheel) {
		System.out.println("Старий діаметр Wheel:" + wheel.getWheelradius());
		wheel.setWheelradius(newwheel);
		System.out.println("New діаметр Wheel:" + wheel.getWheelradius());
	}

	public void ChangediametryRylja(double steerradius) {

		steeeringWheel.setSteerradius(steerradius);
	}

	public void Setwheel(double wheelradius, int wheelcount) {
		wheel.setWheelradius(wheelradius);
		wheel.setWheelcount(wheelcount);
	}

	public void sportrul() {
		steeeringWheel.sportrul();
	}

	public void sportwheel() {
		wheel.sportwheel();
	}

	public void Setsteer(SteeeringWheel steeeringWheel, double setradius) {
		steeeringWheel.setSteerradius(setradius);
	}

	public void ChangManufctr(String m) {
		Manufacturer = m;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Car engine is" + engine + ", body is" + body + ",\n wheel is"
				+ wheel + ", steeeringWheel is" + steeeringWheel
				+ ",\n Manufacturer is" + Manufacturer + ", Model name is "
				+ Model;
	}

	// public String toString() {
	// return "Car " + body + ", " + wheel
	// + ", \n" // \n- це означає що з нової строки
	// + steeeringWheel + ", Manufacturer is " + Manufacturer
	// + ", Model name is " + Model + "]";
	// }

}
