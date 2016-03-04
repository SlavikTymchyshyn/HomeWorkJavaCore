package home6;

public class Rectangle {

	private double length = 25.25;
	private double width = 25.25;

	public Rectangle() {
		// char d=043;
		// Check_Na_kvadrat();
		SqPer();
		System.out.println("              |");
		System.out.println("             \\|/");
		System.out.println("              Y");
		System.out.println("довжина по default: length = " + length);
		System.out.println("ширина по default: width = " + width);

	}

	public Rectangle(double length, double width) {
		if (length > 0 && length != 0 || width > 0 && width != 0) {
			this.length = length;
			this.width = width;
		} else {
			System.out.println();
			System.out.println("Entered incorrect data, please check");
		}
	}

	public double Square() {
		if (width == length) {
			double s = width * length;
			System.out.println("-це квадрат однако");
			return s;
		} else {
			double s = width * length;
			return s;
		}
	}

	public double Perimeter() {
		double p = 2 * (width + length);
		return p;
	}

	public void Check_Na_kvadrat() {
		if (width == length) {
			System.out.println("Так це ж квадрат. Тута же довжина = ширині");
		} else {
			System.out.println("Usual rectangle");
		}
	}

	public void SqPer() {
		System.out.println("Площа прямокутника = " + Square());
		System.out.println("Периметр прямокутника = " + Perimeter());
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
