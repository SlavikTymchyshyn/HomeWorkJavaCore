package less5;

public class Main {

	static int increment(int i) {
		// int i=a;
		i++;
		return i;
	}

	static void add(int[] a) {
		// int[] a=s;
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
	}

	static int[] create(int[] a, int c) {// метод перепосилання на інший масив b
											// в якому на с елемнтів більше
											// і,оск-ки в попередньому менше i
											// то зайві =0
		int[] b = new int[a.length + c];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(a);
		// a=i;
		a = increment(a);
		System.out.println(a);
		int[] s = new int[10];
		add(s);
		// int[]s=int[]a;
		for (int i : s) {
			System.out.println(i);

		}
		s = create(s, 5);
		for (int i : s) {
			System.out.println(i);
		}
	}
}
