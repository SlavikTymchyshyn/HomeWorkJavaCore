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
		return a; // ��� ����� ���� �������� ����� return
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

		int num; // � ���� ������ ���� ����������� ���������� � ������ num
		num = 100;
		// � ���� ������ ���� ���������� nwn 11 ������������� �������� 100
		System.out.println("��o ���������� num: " + num);
		num = num * 2;
		System.out.print("��a�e��e ���������� num * 2 ����� ");
		System.out.println(num);// println ���� ��������� ��� ������ �����
								// ����� �� ������� ������� ���������� �
								// ������ �����

	}
}
/*
 * int[] a =new int[4]; int[]b =a - �������� ������ � �� ���� ������ �� ��� �;
 * a=new int[7] ������ ������� ��������� ����� �� 4 � ������ 7
 */
