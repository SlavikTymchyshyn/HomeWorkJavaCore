package less6;

public class Mains {

	public static void main(String[] args) {

		Human vasyl = new Human(188, 80); // vasyl ����� � ������ ��� ������� �
											// ����.. ���� ���������
		Human ivan = new Human();// ���� � ����� ��� ��� ���
		System.out.println(vasyl.getHeight());
		System.out.println(vasyl.getWeight());// ����� ����� �� ��� ������ ��
												// ������� � ���� ���� ������
		vasyl.setHeight(178);
		vasyl.setWeight(70);
		System.out.println(vasyl.getHeight());
		System.out.println(vasyl.getWeight());
		vasyl.talk();
		int a = vasyl.ideal();
		System.out.println("��� ���� �������� ����: " + a);
		System.out.println(ivan);// �������e ����y ������ ����� � ���� � �����
		System.out.println(vasyl);
		Student petro = new Student();
		petro.ideal();
//
		System.out.println();
		Human fsd=new Student("POlitekhinka","ART");//������ ���� ����� ���������� ���� � ������� �� �����
		System.out.println();
		System.out.println(fsd);
		fsd.setHeight(165);
		fsd.setWeight(65);
		System.out.println(fsd);
	}

}
