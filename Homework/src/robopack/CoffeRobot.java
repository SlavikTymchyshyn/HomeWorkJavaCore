package robopack;

public class CoffeRobot extends Robot {

	public CoffeRobot() {
		super("CoffeRobot");
	}

	public void Work() {
	}// можна ще так це перевизначення методу Work() з Robot який батько зелена
	// стрілка вверх зліва про це говорить

	public void setC(int c) {
		super.setC(c); // для унаслiдування с вiд батька (томущо воно private)
		this.c *= 2; // setC метод з батьківського класу для встановлення
						// значення 'с'
		System.out.println("h=c*2=" + c);
	}
}
