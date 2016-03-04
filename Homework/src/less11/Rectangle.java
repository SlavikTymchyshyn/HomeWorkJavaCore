package less11;

public class Rectangle implements Geometric{
	
	private double a;
	
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double square() {
		return a*b;
	}

	public double perimetr() {
		return 2*(a + b);
	}
}
