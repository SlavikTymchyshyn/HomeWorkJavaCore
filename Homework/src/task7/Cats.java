package task7;

public class Cats extends Animals {

	private String poroda_cat;
	private double weight;
	private double height;

	public Cats(String poroda_cat, double weight, double height) {
		super("ббртіГ");
		this.poroda_cat = poroda_cat;
		if (weight <= 0) {
			this.weight = 5.5;
		} else {
			this.weight = weight;
		}
		if (height <= 0) {
			this.height = 4.5;
		} else {
			this.height = height;
		}
	}

	public Cats(String kind) {
		super("ббртіГ");
	}

	public String getPoroda_cat() {
		return poroda_cat;
	}

	public void setPoroda_cat(String poroda_cat) {
		this.poroda_cat = poroda_cat;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight <= 0) {
			this.weight = 5.5;
		} else {
			this.weight = weight;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			this.height = 4.5;
		} else {
			this.height = height;
		}
	}

	@Override
	public String toString() {
		return "Cats " + super.toString() + " [poroda_cat=" + poroda_cat
				+ ", weight=" + weight + ", height=" + height + "]";
	}

}
