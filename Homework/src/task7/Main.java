package task7;

import less6.Human;

public class Main {

	public static void main(String[] args) {
		Animals plazyn = new Animals("������");
		Animals ssavci = new Animals("������");
		Dogs bulldog = new Dogs("�������", 20.6, 30.8);
		Dogs mops = new Dogs("����", 6.2, 4.8);
		Dogs terjer = new Dogs("����", 9.6, 15.7);
		Cats chiwur = new Cats("����������", 5.5, 6.8);
		Cats egypt = new Cats("lysuj");
		Snakes kobra = new Snakes("�����", "�������", 5.4);
		Snakes vug = new Snakes("���", "����������", 5.8);
		Snakes piton = new Snakes("ϳ���", "��������", 9.4);
		Snakes pitons = new Snakes("����", "��������", 4.9);
		Human kolya = new Human(160, 60);
		System.out.println();
		System.out.println(kolya);
		// System.out.println(ivan); �� ������ � main � ���� � ����� �� � human
		System.out.println("kolya ���� = " + kolya.getWeight());
		System.out.println();
		System.out.println("������� ����� " + piton.getLength());
		System.out.println("������� ��� " + vug.getLength());
		System.out.println("maximal Length is "
				+ Math.max(piton.getLength(), vug.getLength()));
		System.out.println();
		System.out.println(piton);
		System.out.println(chiwur);
		System.out.println(vug);
		System.out.println(terjer);
		System.out.println();
		kolya.talk();
		System.out.println("�������� ���� kolya " + kolya.ideal());
	}

}
