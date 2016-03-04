package less7;

public class Circle implements RoundGeometry {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		return PI * (r * r);
	}

	@Override
	public double perimetr() {
		// TODO Auto-generated method stub
		return 2 * PI * r;
	}

}
