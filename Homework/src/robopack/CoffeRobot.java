package robopack;

public class CoffeRobot extends Robot {

	public CoffeRobot() {
		super("CoffeRobot");
	}

	public void Work() {
	}// ����� �� ��� �� �������������� ������ Work() � Robot ���� ������ ������
	// ������ ����� ���� ��� �� ��������

	public void setC(int c) {
		super.setC(c); // ��� �����i������� � �i� ������ (������ ���� private)
		this.c *= 2; // setC ����� � ������������ ����� ��� ������������
						// �������� '�'
		System.out.println("h=c*2=" + c);
	}
}
