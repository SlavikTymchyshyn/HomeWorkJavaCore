package home13MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods implements InterMethods {

	@Override
	public double add(double a, double b) throws Exception {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double div(double a, double b) throws Exception {
		double c = 0;
		if (b == 0) {
			throw new IllegalArgumentException("wrong arguments");
		} else if (b < 0 && a < 0) {
			throw new ArithmeticException("a<0,b<0");
		}
		c = a / b;

		return c;
	}

	@Override
	public double multiplication(double a, double b) throws Exception {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double sub(double a, double b) throws Exception {
		if (a > 0 && b > 0) {
			throw new MyException(new Throwable());
		}
		return a - b;
	}

	@Override
	public int typeInt() throws Exception {
		String s = null;
		Integer i;
		Scanner Int = new Scanner(System.in);
		String regex = "[1-5]{1}";

		s = Int.nextLine();
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.err.println("Enter number int");
		}

		if (s.isEmpty())
			s = "0";
		if (s.matches(regex)) {

			return Integer.parseInt(s);
		} else
			System.out.println("enter between 1-5");

		return Integer.parseInt(s);
	}

	@Override
	public double typeDouble() throws Exception {
		double d = 0;
		Scanner dbl = new Scanner(System.in);
		try {
			d = dbl.nextDouble();
		} catch (InputMismatchException e) {
			System.err.println("Enter number double");
		}
		return d;

	}

}
