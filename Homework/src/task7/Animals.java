package task7;

public class Animals {

	private String kind;

	public Animals(String kind) {
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Animals [kind=" + kind + "]";
	}

}
