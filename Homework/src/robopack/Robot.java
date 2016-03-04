package robopack;

public class Robot {

	private String type;
	private static int i = 0;// ��� ��� ������ ���� ���� 0 ���� �� � static
								// ��� ������ ���� � ����� ��� �� ��������
	protected int c;
	private static final int FIND_BY_ID_NAME = 0; // ��� ������� final

	public Robot() {
	}

	public Robot(String type) {
		this.type = type;
	}

	public void Work() {
		if (type == "CoffeRobot") {
			System.out.println("� " + type + " � � ���� ����");
		} else if (type == "RobotDancer") {
			System.out.println("� " + type + " � � ������ ������");
		} else if (type == "RobotCoocker") {
			System.out.println("� " + type + " � � ������ �����");
		} else if (type == "Robot") {
			System.out.println("� " + type + " � � ������ ������");
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Robot.i = i;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Robot [type=" + type + "]";
	}

}
