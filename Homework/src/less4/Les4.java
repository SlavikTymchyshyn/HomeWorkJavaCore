package less4;

public class Les4 {

	static void add(int[] dom) {
		// int [] dom=x; java doing
		for (int i = 0; i < dom.length; i++) {
			dom[i] = i + 2;
		}
	}

	static int increment(int a) {
		// int a=c; java doing
		a++;
		return a; // щоб метод шось повертав треба return
		// c=a; java doing
	}

	public static void main(String[] args) {
		int[] x = new int[10];
		add(x);
		for (int i : x) {
			System.out.println(i);
		}
		System.out.println();
		int a = 5;
		int b = a;
		a = 7;
		System.out.println("a=" + a + "; b=" + b);

		int c = 4;
		c = increment(c);
		System.out.println(c);

		int num; // в этой строке кода объявляется переменная с именем num
		num = 100;
		// в этой строке кода переменной nwn 11 присваивается значение 100
		System.out.println("Этo переменная num: " + num);
		num = num * 2;
		System.out.print("Знaчeниe переменной num * 2 равно ");
		System.out.println(num);// println після виконання ніби робить ентер
								// через що слідуюча команда виконується з
								// нового рядка

	}
}
/*
 * int[] a =new int[4]; int[]b =a - присвоює масиву а ту саму адресу що для а;
 * a=new int[7] удаляє поперед зроблений масив на 4 і робить 7
 */
