package robopack;

public class Robot {

	private String type;
	private static int i = 0;// дл€ вс≥х робот≥в вона буде 0 тому що Ї static
								// маэ окреме м≥сце в пам€т≥ €ке не м≥н€Їтьс€
	protected int c;
	private static final int FIND_BY_ID_NAME = 0; // так записс€ final

	public Robot() {
	}

	public Robot(String type) {
		this.type = type;
	}

	public void Work() {
		if (type == "CoffeRobot") {
			System.out.println("я " + type + " Ц € варю каву");
		} else if (type == "RobotDancer") {
			System.out.println("я " + type + " Ц € просто танцюю");
		} else if (type == "RobotCoocker") {
			System.out.println("я " + type + " Ц € просто готую");
		} else if (type == "Robot") {
			System.out.println("я " + type + " Ц € просто працюю");
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
