package less3;

public class Less3 {
	static double[] autoCreate(int size) {
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10 + 5;
			// Math.random() �������� �� ������������ ��� 0 �� 1 default ����
			// *10+5 ��� ���������� ����� ������ �������� �� 5 �� 15
		}
		return array;

	}

	public static void main(String[] args) {
		double[] array = autoCreate(10);
		for (double element : array) {
			System.out.println(element);
		}

	}
	// for each ����� ��� �� ������� ������ ����� �������� ����� �� � �� ��
	// �쳺 �� �����
}
