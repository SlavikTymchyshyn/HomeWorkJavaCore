package less6;

import task7.Animals;

public class Human extends Animals {

	private int height;// ���� �����
	private int weight;// ���� �����

	public Human() {
		super("������");
		System.out.println("I was born");
		talk();
	}; // ��H�������� ����� �� �� ����� ��� �� ��� ���������� ��� ������ void
		// �������� ����� � ������ ��� ������ �����
		// c������ ������ � �� default ����� (Human(){})�� ����� �� ������ ����
		// �� ���� ����������� ����� �����

	public Human(int height, int weight) {
		super("������");
		if (height <= 0) {
			this.height = 100;
		} else {
			this.height = height;
		}
		;
		if (weight <= 0) {
			this.weight = 50;
		} else {
			this.weight = weight;
		}
	}

	// height i weight ����������� �� Human(int height, int weight) � �� ����
	// ����� ���� �� ��������� ����
	// ���� � this.��������� ������� �� ��� ������ �� ���� ����� ����� �����
	// ������� ���������:Human vasyl = new Human(188,80);
	/*
	 * !!!!! ���� ����� � ���� ����� � ������ weight, height, ��� ��� � ����
	 * ��������� ������ �� ����������� ������ �����. � ������ �������, ���
	 * ���������� �� ������ ����� � ������ ��������� ������� ������� �����
	 * this. ���������: this.height=height - ��� �� ���������� ����� �����
	 * this.height ��������� ������� �������� height.
	 */

	public void talk() {// ����� ����� -- � ������� ���� �����
		System.out.println("Hello");
	}

	public int ideal() {
		int ideal = weight - 2;
		return ideal;
	}

	public int getHeight() {// ��� ������� ���� ��� ���� get i set
		return height;// get �������� ��������..set ���������� ��������
	}

	public void setHeight(int height) {
		if (height <= 0) {
			this.height = 100;
		} else {
			this.height = height;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 0) {
			this.weight = 50;
		} else {
			this.weight = weight;
		}
	}

	public String toString() {// toString() �������� �� �� �� ���������� �
								// ������� ���� �� ������������� �� ���������:
								// ����� ������, ����� � ���� � �����
		return "Human " + super.toString() + " [height= " + height
				+ " weight= " + weight + "]";
	}

}
