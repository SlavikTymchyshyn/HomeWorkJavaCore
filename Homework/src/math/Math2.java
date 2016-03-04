package math;

import static java.lang.Math.PI;

public final class Math2 extends MyMath {

	private static int e = 20;

	// @Override
	protected static double length(int b) {
		// super.length();
		double l = 2 * PI * getR() - 20 + b;
		return l;
	}
}
