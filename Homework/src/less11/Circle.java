package less11;

public class Circle implements RoundGeometric{

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	public double square() {
		return PI * r * r;
	}

	public double perimetr() {
		return 2 * PI * r;
	}
}
