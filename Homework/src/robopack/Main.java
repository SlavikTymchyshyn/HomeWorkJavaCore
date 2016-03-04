package robopack;

public class Main {

	public static void main(String[] args) {
		Robot robo = new Robot("Robot");
		Robot robo2 = new Robot("Robot");
		CoffeRobot robo_c = new CoffeRobot();// не можна "_" в назві екземпляра
		CoffeRobot robo_c2 = new CoffeRobot();
		RobotDancer robo_d = new RobotDancer();
		RobotDancer robo_d2 = new RobotDancer();
		RobotCoocker robo_ck = new RobotCoocker();
		RobotCoocker robo_ck2 = new RobotCoocker();
		robo_c2.setC(5);
		System.out.println();
		robo_ck.Work();
		robo_c2.Work();
		System.out.println();
		robo_c.Work();
		robo_ck2.Work();
		System.out.println();
		robo_d.Work();
		robo2.Work();
		System.out.println();
		robo.Work();
		robo_d2.Work();
		// знизу ще один спосіб створення екземплярів через масив

		Robot[] robots = new Robot[4];
		robots[0] = new Robot();
		robots[1] = new RobotDancer();
		robots[2] = new CoffeRobot();
		robots[3] = new RobotCoocker();
		// for (int i=0;i<robots.length;i++){Robot rob=robots[i];rob.Work();}

		for (Robot robot : robots) {
			robot.Work();
		}
	}
}
