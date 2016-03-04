package task7;

public class Snakes extends Animals {

	private double length;
	private String name_of_snake;
	private String kind_of_snake;

	public Snakes(String name_of_snake, String kind_of_snake, double length) {
		super("Плазун");
		if (length <= 0) {
			this.length = 5.4;
			System.out.println("Enter correct Snake lenght of " + name_of_snake
					+ "a or it willBeDefault");
		} else {
			this.length = length;
		}
		this.name_of_snake = name_of_snake;
		this.kind_of_snake = kind_of_snake;
	}

	public Snakes(String kind) {
		super("Плазун");
	}

	// public double MaxLength(double[] l){}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length <= 0) {
			this.length = 5.4;
		} else {
			this.length = length;
		}
	}

	public String getName_of_snake() {
		return name_of_snake;
	}

	public void setName_of_snake(String name_of_snake) {
		this.name_of_snake = name_of_snake;
	}

	public String getKind_of_snake() {
		return kind_of_snake;
	}

	public void setKind_of_snake(String kind_of_snake) {
		this.kind_of_snake = kind_of_snake;
	}

	@Override
	public String toString() {
		return "Snakes " + super.toString() + " [name_of_snake="
				+ name_of_snake + ", kind_of_snake=" + kind_of_snake
				+ ", length=" + length + "]";
	}

}
