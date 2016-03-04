package home9a;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class Loop {

	void task1() {
		for (int i = 1000; i <= 1015; i += 3) {
			System.out.print(i + " ");
		}
	}

	void t2() {
		int i = 0;
		for (int k = 1; i < 55; k += 2) {
			i++;
			System.out.print(k + " ");
		}
	}

	void t3() {
		int k = 90;
		do {
			System.out.print(k + " ");
			k -= 5;
		} while (k >= 0);
	}

	void t4() {
		int i = 0;
		int k = 2;
		do {
			System.out.print(k + " ");
			k *= 2;
			i++;
		} while (i < 20);
	}

	void t5() {
		int a1 = 2;
		do {
			System.out.print(a1 + " ");
			a1 = a1 * 2 - 1;
		} while (a1 < 10000);
	}

	void t6() {
		for (int a1 = -166; a1 < 100; a1 = a1 * 2 + 200) {
			if (a1 > -100) {
				System.out.print(a1 + " ");
			}
		}
	}

	char typeInChar(){
		Scanner chr =new Scanner(System.in);
		char ch=0;
		System.out.println("Type Math Operand:");
		if(chr.hasNextLine()){
			String s=chr.nextLine().trim();
			return (s.length()==1)?ch=s.charAt(0): 0;
			}
		else{System.out.println("type one character instead of "+ch);}
		return ch;
	}

	double typeInDouble() {
		double g = 0;
		Scanner fack = new Scanner(System.in);
		System.out.println("Type double number: ");
		return (fack.hasNextDouble())?g=fack.nextDouble():0;
	}
	
	int typeInInt() {
		int g = 0;
		Scanner fack = new Scanner(System.in);
		System.out.println("Type number: ");
	/*	if (fack.hasNextInt()) {
			g = fack.nextInt();
		} else {
			System.out.println("error, enter correct int type data");
			typeInInt();
		}
		return g;*/
		return (fack.hasNextInt())?g = fack.nextInt():typeInInt();
	}

	int fact(int num) {
		if (num == 1)return 1;
		int result;
		result = num * fact(num - 1);
			return result;
		}	
		// return (num == 0) ? 1 : num * fact(num - 1);// factorial 7th task
//	}

	void Alldivisors(int num) {// всі позитивні дільники 8ме завдання
		if (num == 0) {
			System.out.println("задайте ціле число більше >0");
			return;
		}
		for (int i = 2; i <= num; i++) {
			if ((num % i) == 0) {
				if ((i % 2) == 0) {
					System.out.print(i + " -even divisor, ");
				} else {
					System.out.println(i + " -odd divisor");
				}
			}
		}
	}

	// найменший дільник 9е завдання з діапазоном [2; sqrt(n)]. ??? ask!!correct
	void divisors(int num) {
		boolean isSimple;

		if (num < 2) {
			isSimple = false;
			System.out.println("enter number >=2");
			return;
		} else
			isSimple = true;

		for (int i = 2; (i * i) <= num; i++) {
			switch (i) {
			case 2:
			case 3:
			case 4:
				if (num % i == 0) {
					isSimple = false;
					System.out.println("min div for " + num + "=" + i);
					return;
				} else
					i++;
			default:
				if (num % i == 0) {
					isSimple = false;
					System.out.println("min div for " + num + "=" + i);
					return;
				} else if (i > sqrt(num)) {
					System.out.println("simple");
				}
				break;
			}
		}
		if (isSimple)
			System.out.println("Пpocтoe число");
		else
			System.out.println("He простое число");
	}

	void sequence10() {
		int i = 0;
		int a;
		for (; i < 12; i++)
			switch (i) {
			case 0:
				a = 3;
				System.out.print(a + " ");
				break;
			case 1:
				a = 2;
				System.out.print(a + " ");
				break;
			default:
				a = 2 * i - 2;
				System.out.print(a + " ");
				break;
			}
	}

	void poslidovn10(int numb) {
		for (int a = 3; a < 15; a++) {
			int i = ((2 * a * numb) - 2);
			System.out.print(i + "; ");
		}
		System.out.println();
	}

	void EnterNumber(int n) {
		int r1 = n % 10;
		int r2 = ((n - n % 10) / 10);// 1
		int r2a = ((n % 100 - n % 10) / 10);// 2nd for more than 2digits
		int r33 = ((n - n % 100) / 100);//
		int r3a = ((n % 1000 - n % 100) / 100);// 3rd for more than 3digits
		int r4four = ((n - n % 1000) / 1000);//
		int r4a = ((n % 10000 - n % 1000) / 1000);// 4th for more than 4digits
		int r5 = ((n - n % 10000) / 10000);
		if ((n % 10) == 0 && n < 100) {
			System.out.println("sum of digits is " + r2);
		} // yes
		else if ((n % 100) == 0 && n < 1000) {
			System.out.println("sum of digits is " + r33);
		} // yes
		else if ((n % 1000) == 0 && n < 10000) {
			System.out.println("sum of digits is " + r4four);
		} // yes
		else if ((n % 10000) == 0 && n < 100000) {
			System.out.println("sum of digits is " + r5);
		} // yes
		else if ((n % 10) != 0 && n < 100) {
			System.out.println("sum of digits is " + (r2 + r1));
		} // yes
		else if ((n % 100) != 0 && n < 1000) {
			System.out.println("sum of digits is " + (r33 + r1 + r2a));
		} // yes
		else if ((n % 1000) != 0 && n < 10000) {
			System.out.println("sum of digits is " + (r4four + r3a + r2a + r1));
		} else if ((n % 10000) != 0 && n < 100000) {
			System.out.println("sum of digits is "
					+ (r5 + r4a + r3a + r2a + r1));
		}
	}

	void mass1() {
		int f[] = new int[11];
		for (int i = 1; i < f.length; i++) {
			f[i] = 2 * i;
			System.out.print(f[i] + " ");
		}
	}

	void mass2() {
		int f[] = new int[99];
		for (int i = f.length - 1; i >= 0; i--) {
			f[i] = i + 1;
			System.out.print(f[i] + " ");
		}
	}

	void mass3() {
		int f[] = new int[15];
		int countp = 0;
		for (int i = f.length - 1; i >= 0; i--) {
			f[i] = (int) (random() * 10);
			if ((f[i] % 2) == 0 && f[i] != 0) {
				countp++;
			}
			System.out.print(" " + f[i] + " ");

		}
		System.out.println();
		System.out.println(" parne-" + countp);

	}

	public void mass4() {
		int f[] = new int[8];
		for (int i = f.length - 1; i >= 0; i--) {
			f[i] = (int) (random() * -10 + 11);
			System.out.print(" " + f[i] + " ");
			// System.out.println();
		}
		System.out.println();
		int g[] = f;
		for (int i = f.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				g[i] = 0;
				System.out.print(" " + g[i] + " ");
			} else {
				g[i] = (int) (random() * -10 + 11);
				System.out.print(" " + g[i] + " ");
			}
		}
	}

	void mass5() {
		int f[] = new int[5];
		int m1 = 0;
		int m2 = 0;
		for (int i = f.length - 1; i >= 0; i--) {
			f[i] = (int) (random() * 6);
			System.out.print(" " + f[i] + " ");
			m1 += f[i];
		}
		System.out.println();
		int g[] = new int[5];
		for (int i = g.length - 1; i >= 0; i--) {
			g[i] = (int) (random() * 6);
			System.out.print(" " + g[i] + " ");
			m2 += g[i];
		}
		System.out.println();
		double am1 = (double) (m1) / (double) (f.length);
		double am2 = (double) (m2) / (double) (g.length);
		System.out.println("avg m1=" + am1);
		System.out.println("avg m2=" + am2);
		if (am1 > am2) {
			System.out.println("avg m1 > m2");
		} else if (am1 == am2) {
			System.out.println("avg m1 = m2");
		} else {
			System.out.println("avg m1 < m2");
		}
	}

	void massIncrease() {
		int f[] = new int[4];
		int v0 = 100;
		int v1 = v0;
		int v2 = v1;
		int v3 = v2;
		String inc;
		int i = 0;
		for (; i < f.length; i++) {
			f[i] = (int) (random() * (100 - 9) + 9);
			if (v0 > f[i]) {
				v0 = f[i];
			} else if (v1 > v0 && v1 > f[i]) {
				v1 = f[i];
			} else if (v2 > v1 && v2 > f[i]) {
				v2 = f[i];
			} else if (v3 > v2 && v3 > f[i]) {
				v3 = f[i];
			}
			int[] compare = { v0, v1, v2, v3 };
			if (Arrays.equals(f, compare)) {
				inc = new String("increase type ");
				System.out.print(inc);
			} else {
				inc = new String(" ");
				System.out.print(inc);
			}
			System.out.print(compare[i] + "-" + "\n");
		}
		System.out.print(Arrays.toString(f));

	}

	void massMaxValue() {
		int[] f = new int[12];
		int max = -15;
		int min = 15;
		int max_index = 0;
		int min_index = 0;
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (random() * (16 + 16) - 16);
			if (max < f[i]) {
				max = f[i];
				max_index = i;
				System.out.print(f[i] + " ");
			} else if (min > f[i]) {
				min = f[i];
				min_index = i;
				System.out.print(f[i] + " ");
			} else {
				System.out.print(f[i] + " ");
			}
		}
		System.out.println();
		System.out.println("max =" + max);
		System.out.println("min =" + min);
		System.out.println("max index =" + max_index + " а номер порядка-"
				+ (max_index + 1));
		System.out.println("min index =" + min_index + " а номер порядка-"
				+ (min_index + 1));
	}

	void mass8() {
		int[] f = mass81();
		for (int i : f) {
			System.out.print(i + "f ");
		}
		System.out.println();
		int[] g = mass81();
		for (int i : g) {
			System.out.print(i + "g ");
		}
		System.out.println();
		double[] k = new double[10];

		int c = 0;
		for (int i = 0; i < k.length; i++) {
			k[i] = (double) (f[i]) / (double) (g[i]);
			if (floor(k[i]) == k[i]) {
				c++;
				System.out.print(k[i] + "k ");
			} else {
				System.out.print(k[i] + "k ");
			}
		}
		System.out.println();
		System.out.println("кількість цілих є " + c);
	}

	int[] mass81() {
		int[] f = new int[10];
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (random() * (9) + 1);
		}
		return f;
	}

	void mass9() {
		int[] f = new int[11];
		int MinusOne = 0;
		int PlusOne = 0;
		int Zero = 0;
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (random() * 4 - 2);
			if (f[i] == -1) {
				System.out.print(f[i] + " ");
				MinusOne++;
			} else if (f[i] == 0) {
				System.out.print(f[i] + " ");
				Zero++;
			} else {
				System.out.print(f[i] + " ");
				PlusOne++;
			}
		}
		System.out.println();
		if (MinusOne == PlusOne || MinusOne == Zero || Zero == PlusOne) {
			System.out.println("null");
		} else {
			System.out.println("MinusOne=" + MinusOne + " PlusOne=" + PlusOne
					+ " Zero=" + Zero);
		}
	}

	void Aftermass1(int num) {
		if ((num % 2) == 0) {
			System.out.println("number " + (num) + " is even");
		} else {
			System.out.println("number " + (num) + " is odd");
		}
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("c=" + c);
	}

	void threeNum(double a, double b, double c) {
		a = abs(a);
		b = abs(b);
		c = abs(c);
		// double min=a+b+c;
		if (abs(a) < abs(b) && abs(a) < abs(c)) {
			System.out.println("a min" + a);
		} else if (abs(b) < abs(a) && abs(b) < abs(c)) {
			System.out.println("b min" + b);
		} else {
			System.out.println("c min" + c);
		}
	}

	String typeInWord() {
		String g = null;
		Scanner fack = new Scanner(System.in);
		System.out.println("Type String data: ");
		return (fack.hasNextLine())?g = fack.nextLine():typeInWord();
	}

	void polindrom(String f) {
		if (f.length() != 5) {
			System.out.println("enter 5letters:");
			return;
		}
		char[] array = new char[f.length()];
		for (int i = 0; i < f.length(); i++) {
			array[i] = f.charAt(f.length() - 1 - i);
		}
		String s = String.valueOf(array);
		if (f.contentEquals(s)) {
			System.out.println(f + "<--is polyandrom");
		} else {
			System.out.println(f + "<-usual->" + s);
		}
	}

	void delCharInLine(String f, String oldchar) {
		String g = f.replace(oldchar, "").trim();
		System.out.println(g);
	}
	
		

	void LineToLowOrUpper(String f) {
		String small = f.toLowerCase();
		if (f.contentEquals(small)) {
			String Big = f.toUpperCase();
			System.out.println(Big);
		} else {
			System.out.println(small);
		}
	}

	void MassIncrease2() {
		int[] f = new int[4];
		int[] g = new int[f.length];
		int i = 0;
		for (; i < f.length; i++) {
			f[i] = (int) (random() * (100 - 9) + 9);
			g[i] = f[i];
		}
		Arrays.sort(g);// sort by increase
		if (Arrays.equals(f, g)) {
			System.out.println("increase");
		} else {
			System.out.println("usual");
		}
		System.out.println(Arrays.toString(g));
		System.out.println();
		System.out.println(Arrays.toString(f));
	}

	boolean MassIncrease3(int[] b) {
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] > b[i + 1]) {
				return false;
			}
		}
		return true;
	}

	void FoundValue(int num) {
		if (num < 0 & num > 20) {
			System.out.println("enter beetween 0 and 20:");
		}
		int[] f = new int[15];
		boolean found = false;
		for (int i = 0; i < f.length; i++) {
			f[i] = (int) (random() * 20);
		}
		for (int x : f) {
			System.out.print(x + " ");
			if (x == num) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("found");
		} else
			System.out.println("not found");

	}

	void Weekend(String g) {
		String w = g.toLowerCase().trim();
		String r=new String("a-zA-z");
		Pattern p = Pattern.compile("a-zA-z");
		
		{
			switch (w) {
			case "monday":
				System.out.println("Перший день тижня");
				break;
			case "tuesday":
				System.out.println("Другий день тижня");
				break;
			case "wednesday":
				System.out.println("Третій день тижня");
				break;
			case "thursday":
				System.out.println("Четвертий день тижня");
				break;
			case "friday":
				System.out.println("Пятий день тижня");
				break;
			case "saturday":
				System.out.println("Шостий день тижня");
				break;
			case "sunday":
				System.out.println("Сьомий день тижня");
				break;
			default:
				System.out.println("Enter correct name of day");
				Weekend(typeInWord());
			}
		}
	}
//	 @Override
	 void compareTo(String one,String another){
		 if(one.contentEquals(another)){System.out.println("exect copy");}
	 else if (one.contains(another)){System.out.println("one contain part of another");}
	 else{System.out.println("there are no matches");}
	 }

}
