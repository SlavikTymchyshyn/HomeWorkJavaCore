package home8;

public class Body {

	private String numberbody;

	private String color;

	private double weight;

	public Body(String numberbody, String color, double weight) {
		this.numberbody = numberbody;
		this.color = color;
		this.weight = weight;
	}

	public String getNumberbody() {
		return numberbody;
	}

	public void setNumberbody(String numberbody) {
		this.numberbody = numberbody;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return ": [numberbody is " + numberbody + ", color is " + color
				+ ", weight=" + weight + "]";
	}

}
