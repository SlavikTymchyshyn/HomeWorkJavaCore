package home7;

public abstract class Worker implements Zarplata {

	@Override
	public void zarplata() {
		System.out.println("�������� ���������� " + getClass().getSimpleName()
				+ " � " + Zp());
	};

	protected abstract double Zp();

	protected double premia() {
		return .2 * stavka;
	}

	void premialni() {
		System.out.println("����� ��� " + getClass().getSimpleName() + " � "
				+ premia());
	};

}
