package home7;

public abstract class Worker implements Zarplata {

	@Override
	public void zarplata() {
		System.out.println("Зарплата працівника " + getClass().getSimpleName()
				+ " є " + Zp());
	};

	protected abstract double Zp();

	protected double premia() {
		return .2 * stavka;
	}

	void premialni() {
		System.out.println("премія для " + getClass().getSimpleName() + " є "
				+ premia());
	};

}
