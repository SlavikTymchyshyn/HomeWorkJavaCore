package less5;

import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vk1 {

	static int randM() {
		int c = (int) (random() * 10 - 11);
		do {
			return c;
		} while (c == 0);
		// minus

	}

	static int randP() {
		int l = (int) (random() * (-10) + 11);
		do {
			return l;
		} while (l == 0);
	}

	// plus

	static int[] randmas(int s) {
		int a[] = new int[s];
		int m = 0;
		int p = 0;
		for (int i = 0; i < a.length; i++) {
			if (m < 6 & random() <= 1 & random() > .5 || p < 6) {
				a[i] = randM();
				m++;
			} else {
				a[i] = randP();
				p++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (p < 6 & random() < .5 & random() >= 0 || m < 6) { /*
																 * if (p < 6 &
																 * random() <=
																 * .5 || m < 6)
																 */
				a[i] = randP();
				p++;
			} else {
				a[i] = randM();
				m++;
			}
		}
		return a;
	}

	static int[] rt(int s) {
		int m = 0;
		int p = 0;
		int a[] = new int[s];
		for (int i = 0; i < s / 2; i++) {
			if (p < 3 & m < 3 & randM() > 0) {
				a[i] = (randM()) * -1;
				p++;
				m--;
			} else {
				a[i] = -1 * (randM()) * 1;
				m++;
				p--;
			}
		}

		for (int i = s / 2; i < s; i++) {
			if (p < 3 & m < 3 & randP() > 0) {
				a[i] = (randP()) * -1;
				p++;
				m--;
			} else {
				a[i] = (randP()) * -1;
				m++;
				p--;
			}
		}

		// List<int[]> l;
		// l=(Arrays.asList(a));
		// Collections.shuffle(l);
		// l.toArray();

		return a;
	}

	public static void main(String[] args) {

		System.out.println();
		int g[] = randmas(12);
		for (int i : g) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		int[] u = rt(12);
		for (Object object : u) {
			System.out.print(" " + object + " ");
		}
	}
}

/*
 * 1. ѕрограмма должна создать массив из 12 случайных целых чисел из отрезка
 * [-10;10] таким образом, чтобы отрицательных и положительных элементов там
 * было поровну и не было нулей. ѕри этом пор€док следовани€ элементов должен
 * быть случаен (т. е. не подходит вариант, когда в массиве посто€нно выпадает
 * сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы
 * посто€нно чередуютс€ через один и пр.). ¬ывести полученный массив на экран.
 */
