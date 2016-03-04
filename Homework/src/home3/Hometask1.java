package home3;

public class Hometask1 {

	static int random2(int n) {
		return (int) (Math.random() * 2 * n - n);
	}

	static int random(int a, int b) {
		return (int) (Math.random() * (Math.max(a, b) - Math.min(a, b)) + Math
				.min(a, b));

		/*
		 * if (a > b) { return (int) (Math.random() * (a - b) + b); } else {
		 * return (int) (Math.random() * (b - a) + a); }
		 */
	}

	static int[] mass(int size) {
		int arr1[] = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = random(5, 20);
		}
		return arr1;
	}

	static void printer(int arr1[]) {
		for (int is : mass(20)) {
			System.out.print(is + " ");
		}
		System.out.println();
		for (int i : mass(10)) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printer(mass(20));

		// System.out.println(random2(5));

		/*
		 * for (int is : mass(20)) { System.out.println(is+" "); }
		 */

		System.out.println();
		mass(10);
		for (int element : mass(10)) {
			System.out.print(element + " ");
		}
		System.out.println();
		mass(10);
		for (int element : mass(10)) {
			System.out.print(element + " ");
		}
		System.out.println();
		mass(10);
		for (int element : mass(10)) {
			System.out.print(element + " ");
		}
		System.out.println();
		mass(10);
		for (int element : mass(10)) {
			System.out.print(element + " ");
		}
		System.out.println();
		mass(10);
		for (int element : mass(10)) {
			System.out.print(element + " ");
		}
	}
}

/*
 * System.out.println(Math.random()*5+3); // вещественное число из [3;8)
 * System.out.println( (int)(Math.random()*5+3) ); // целое число из [3;7]
 * відкидає дробову частину
 */
