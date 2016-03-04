package less7;

public class Rectangle implements Geometric {

	private double a;

	private double b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double square() {
		return a * b;
	}

	@Override
	public double perimetr() {
		return 2 * (a + b);
	}

}
