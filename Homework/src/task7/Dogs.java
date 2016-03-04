package task7;

public class Dogs extends Animals {

	private String poroda_dog;
	private double weight;
	private double height;

	public Dogs(String poroda_dog, double weight, double height) {
		super("ббртіГ");
		this.poroda_dog = poroda_dog;
		if (weight <= 0) {
			this.weight = 8.8;
		} else {
			this.weight = weight;
		}
		if (height <= 0) {
			this.height = 7.5;
		} else {
			this.height = height;
		}
	}

	public Dogs(String kind) {
		super("ббртіГ");
	}

	public String getPoroda_dog() {
		return poroda_dog;
	}

	public void setPoroda_dog(String poroda_dog) {
		this.poroda_dog = poroda_dog;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight <= 0) {
			this.weight = 8.8;
		} else {
			this.weight = weight;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			this.height = 7.5;
		} else {
			this.height = height;
		}
	}

	@Override
	public String toString() {
		return "Dogs " + super.toString() + " [poroda_dog=" + poroda_dog
				+ ", weight=" + weight + ", height=" + height + "]";
	}

}
