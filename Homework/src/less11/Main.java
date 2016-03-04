package less11;

public class Main {

	static void print(Geometric g) {
		double square = g.square();
		double perimetr = g.perimetr();
		System.out.println(g.getClass().getSimpleName() + " Площа = " + square
				+ " периметр = " + perimetr);
	}

	public static void main(String[] args) {
		// Geometric r = new Rectangle(3.4, 2.6);
		// double square = r.square();
		// double perimetr = r.perimetr();
		// System.out.println("Площа = " + square + " периметр = " + perimetr);
		// r = new Circle(4.5);
		// square = r.square();
		// perimetr = r.perimetr();
		// System.out.println("Площа = " + square + " периметр = " + perimetr);
		print(new Rectangle(3.4, 2.6));
		print(new Circle(4.5));
	}

}
