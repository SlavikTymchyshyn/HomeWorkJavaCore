package home7;

public class Monthworker extends Worker {

	public Monthworker() {
	}

	@Override
	public double Zp() {
		// TODO Auto-generated method stub
		return stavka + premia();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[Зарплата= " + Zp()
				+ ", premia()=" + premia() + "]";
	}

}
