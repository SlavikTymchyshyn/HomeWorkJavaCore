package home13MyException;

public class BeforeMain {

	private Methods m;

	public BeforeMain(Methods m) throws Exception {
		this.m = new Methods();
		do {
			System.out.println("1.a+b");
			System.out.println("2.a/b");
			System.out.println("3.a-b");
			System.out.println("4.a*b");
			System.out.println("5.exit");
			System.out.println();
			System.out.println("Your choise:");
			try {
				int Ar = m.typeInt();
				double a;
				double b;
				switch (Ar) {
				case 1: {
					System.out.println("Enter a");
					a = m.typeDouble();
					System.out.println("Enter b");
					b = m.typeDouble();
					System.out.println("a+b=" + m.add(a, b));
					break;
				}
				case 2: {
					System.out.println("Enter a");
					a = m.typeDouble();
					System.out.println("Enter b");
					b = m.typeDouble();
					System.out.println("a/b=" + m.div(a, b));
					break;
				}
				case 3: {
					System.out.println("Enter a");
					a = m.typeDouble();
					System.out.println("Enter b");
					b = m.typeDouble();
					System.out.println("a-b=" + m.sub(a, b));
					break;
				}
				case 4: {
					System.out.println("Enter a");
					a = m.typeDouble();
					System.out.println("Enter b");
					b = m.typeDouble();
					System.out.println("a*b=" + m.multiplication(a, b));
					break;
				}
				case 5: {
					System.exit(0);
				}
				}
			} catch (NumberFormatException e) {
				System.err.println("не вводьте symbol а цифру треб");
			}
		} while (true);

	}
}