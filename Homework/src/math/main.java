package math;

import static java.lang.Math.*;//що використовувати статичні методи з nього класу тре static 

public class main extends MyMath {

	public static double square(int i) { // overload method (add int i)
		double s = i + getN() * PI;
		return s;
	}

	public static void main(String[] args) {
		System.out.println("static a=" + a);
		System.out.println("Довжина кола = " + length());
		System.out.println();
		System.out.println("square=" + square());
		System.out.println("Місцевий overload square=" + square(10));
		System.out.println();
		System.out.println("final squareCircle=" + squareCircle());// final
																	// method
																	// not
																	// overriding
		System.out.println("final (getter)n=" + getN());
		System.out.println("random (from (getters) " + min(getP(), getT())
				+ " to " + max(getP(), getT()) + ")=" + rand());
		MyMath b = new math.Math2();
		Math2 c = new math.Math2();

		System.out.println(c.getClass().getSimpleName());
		// System.out.println(Math2.length(b));
	}

	// @Override //чого йому бракуэ
	public static double square() {
		double s = getN() * getQ() + 6;
		return s;
	}
}
