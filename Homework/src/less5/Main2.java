package less5;

public class Main2 {

	public static void main(String[] args) {
		String a = "Hello";// a,b,c- � ���������(������) �� ������
		String b = "Hello";// ��� new ������ ���� ������ � ����� � ��� �����
							// �-�� �������� � ���� �������� �� ����� �� �
							// ���� ������
		String c = new String("Hello");// ���� ���� ������ �� � ���� ���������
		int length = a.length();
		System.out.println(length);
		a = b + c;
		System.out.println(a);
		a = b.concat(c);// concat �� �� ���� �� + ����� ��������� ������
						// ������� +; Null pointer exception ������� ���
						// ������� ������ ���� �� �� �������������� ����� ��
						// ��� ��������
		a = a.replaceAll("lo", " fuck ");// ����� �� ���� � ������ �����
		System.out.println(a);
		char[] f = a.toCharArray();// ����� ���� ���������� ������ � ����� char
		a = new String(f);// �������� ����� ���� ���� ���������� ������ �
							// ����������� ������� (�� ��������� 2� �������
							// �����)
	}

}
