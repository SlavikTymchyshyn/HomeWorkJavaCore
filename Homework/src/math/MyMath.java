package math;

import static java.lang.Math.*;

class MyMath {

	static double a = 1.5;
	private int f = 6;// static methods не мають доступу до неї в{}
	private static double r = 20.15;
	private static double p = 21.45;
	private static double t = 58.65;
	private static final double q = a;
	private static final int n = 90;// константи

	protected static double length() {
		double l = 2 * PI * r;
		return l;
	}

	public static double square() {
		double s = n * q;
		return s;
	}

	protected final static double squareCircle() {
		double s = PI * pow(r, 2);
		return s;
	}

	protected static double rand() {
		double o = random() * (max(t, p) - min(t, p)) + min(t, p);// random(min,max)
		return o;
	}

	// getter setter
	public static double getR() {
		return r;
	}

	public static void setR(double r) {
		MyMath.r = r;
	}

	public static double getP() {
		return p;
	}

	public static void setP(double p) {
		MyMath.p = p;
	}

	public static double getT() {
		return t;
	}

	public static void setT(double t) {
		MyMath.t = t;
	}

	public static double getQ() {
		return q;
	}

	public static int getN() {
		return n;
	}

}
