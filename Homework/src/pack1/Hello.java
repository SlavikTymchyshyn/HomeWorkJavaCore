package pack1;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Greatful things");
		System.out.println("djkfhdskjfh");
		System.out.println("*  * *** *     *     ***");
		System.out.println("*  * *   *     *    *   *");
		System.out.println("**** *** *     *    *   *");
		System.out.println("*  * *   *     *    *   *");
		System.out.println("*  * *** ****  ****  ***");
		int i = 2;
		char c = 'd';
		boolean isTrue = true;
		long l = 9999999;
		short s = 45;
		byte b = -128;
		double d = 23.5;
		float f = 45.6f;
		float t = (float) 45.6;

		if (s < b) {
			System.out.println(s);
		} else if (isTrue) {
			System.out.println(b);
		}

		switch (i) {
		case 1: {
			System.out.println("case 1");
			System.out.println(--i);
			break;
		}
		case 2: {
			System.out.println("case 2");
			System.out.println(++i);
			break;
		}
		default: {
			System.out.println("default");
			System.out.println(i / 2);
		}

			System.out.println("start while");
			while (i < 10) {
				i++;
				System.out.println(i);
			}

			System.out.println("start do while");
			int j = 4;
			do {
				j++;
				System.out.println(j);
			} while (j < 10);

			System.out.println("Start for");
			for (int ij = 0; ij < 10; ij++) {
				System.out.println(ij);
			}
		}
	}
}
// System.out.println ��� ������ ��������� ��������;
// public static void main(String[] args) - main ����� ����� ����� �;
// ctrl shift f ��� ������ ���� �� �i�������;
// System.out.println(); - syso -ctrl-space;
// default ���� �� ���������� ������ case ����� ���� �� ����� break;
// switch ������ �� if;
// while ����������� ���� ����� �������
// do while ����������� ���� ���� ��� ����� ����� ��� ���
// for ���� ��� ��������� ����� ������� ��� �� �������� �����

