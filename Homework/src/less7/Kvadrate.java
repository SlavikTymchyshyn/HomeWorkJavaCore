package less7;

public class Kvadrate implements Geometric {

	private double a;

	public Kvadrate(double a) {

		this.a = a;
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		return a * a;
	}

	@Override
	public double perimetr() {
		// TODO Auto-generated method stub
		return 4 * a;
	}

}
