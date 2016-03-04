package less6;

import task7.Animals;

public class Human extends Animals {

	private int height;// поля класу
	private int weight;// поля класу

	public Human() {
		super("ССавці");
		System.out.println("I was born");
		talk();
	}; // коHструктор класу це як метод але не маэ повернення вын завжди void
		// повертаэ мысце в памяты яке займаэ обэкт
		// cтрочка зверху э по default пуста (Human(){})її можна не писати якшо
		// не буде вписуватись якась логіка

	public Human(int height, int weight) {
		super("ССавці");
		if (height <= 0) {
			this.height = 100;
		} else {
			this.height = height;
		}
		;
		if (weight <= 0) {
			this.weight = 50;
		} else {
			this.weight = weight;
		}
	}

	// height i weight звертаэться до Human(int height, int weight) а не вище
	// тобто того що вводитись буде
	// якщо є this.заставляє глянути за межі методу на поля класу тобто можна
	// вводити параметри:Human vasyl = new Human(188,80);
	/*
	 * !!!!! Вони могли б мати назви і просто weight, height, але тоді б вони
	 * перекрили доступ до однойменних змінних класу. В такому випадку, щоб
	 * звернутися до змінних класу з методу необхідно вживати ключове слово
	 * this. Наприклад: this.height=height - тут ми присвоюємо змінній класу
	 * this.height одержаний методом параметр height.
	 */

	public void talk() {// метод класу -- і порядок саме такий
		System.out.println("Hello");
	}

	public int ideal() {
		int ideal = weight - 2;
		return ideal;
	}

	public int getHeight() {// для кожного поля маэ бути get i set
		return height;// get повертаэ значення..set встановлює значення
	}

	public void setHeight(int height) {
		if (height <= 0) {
			this.height = 100;
		} else {
			this.height = height;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 0) {
			this.weight = 50;
		} else {
			this.weight = weight;
		}
	}

	public String toString() {// toString() відповідаэ за то що виводиться в
								// консоль якщо не перевизначати то виводться:
								// назва пакета, класу і місце в памяті
		return "Human " + super.toString() + " [height= " + height
				+ " weight= " + weight + "]";
	}

}
