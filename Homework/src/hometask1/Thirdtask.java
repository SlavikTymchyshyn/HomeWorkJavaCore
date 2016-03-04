package hometask1;

public class Thirdtask {
	static double oper(int a, int b, char znak) {

		/*
		 * if (a < b) { a = Math.max(a, b); b = Math.min(a, b); }
		 */
		int c = 0;

		switch (znak) {
		case '+': {
			c = a + b;
			System.out.print("in case a + b = " + a + " + " + b + " = " + c);
			return c;
		}
		case '-': {
			c = (a - b);
			System.out.print("in case a - b = " + a + " - " + b + " = " + c);
			return c;
		}
		case '*': {
			c = a * b;
			System.out.print("in case a * b = " + a + " * " + b + " = " + c);
			return c;
		}
		case '/': {
			double c1 = (double) a / (double) b;
			System.out.print("in case a / b = " + a + " / " + b + " = " + c1);
			return c1;
		}

		default: {
			System.out.print("ERROR: empty or incorrect character " + znak);
		}
		}
		return c;
	}

	public static void main(String[] args) {
		char z = '-';
		int r = 1;
		int w = 4;
		oper(r, w, z);
	}
}
/*
 * static int add(int a,int b){ return a+b;
 * 
 * static int minus(int a,int b){ return a-b;
 * 
 * } static int mnozhn(int a,int b){ return a*b;
 * 
 * } static double divide(int a,int b){ return a/b; }
 */

// double c =divide(12,4,'+');
// System.out.println(c);}}
// 43+42*45-47/
/*
 * switch (znak) { case '+': { System.out.print("in case a + b = "+add(a,b));
 * break; } case '-': { System.out.print("in case a - b = "+minus(a,b)); break;
 * } case '*': { System.out.print("in case a * b = "+mnozhn(a,b)); break; } case
 * '/': { System.out.print("in case a / b = "+divide(a,b)); break; } default: {
 * System.out.print("ERROR: empty or incorrect character " +znak); }
 */

