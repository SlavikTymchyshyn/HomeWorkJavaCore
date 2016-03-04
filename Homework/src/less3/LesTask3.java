package less3;

public class LesTask3 {
	static int size() {
		return (int) (random(1, 30));
	};

	static double random(int min, int max) {
		return Math.random() * (max - min) + min;
	}

	static double[] autoCreate(int size) {
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(5, 15);
			// Math.random() повертаэ по замовчуванню выд 0 до 1 default тому
			// *10+5 для різноманіття тобто будуть значення від 5 до 15
		}
		return array;

	}

	static void print(double[] array) {
		for (double d : array) {
			System.out.println(d);
		}
	};

	public static void main(String[] args) {
		int random = size();
		for (int i = 0; i < random; i++) {
			double[] array = autoCreate(size());
			print(array);
			System.out.println();
		}
	}
}

// створити масив 2вимірний масив 9*9 заповнити від 1до9 і в квадрати 3*3 від
// 1до9 як в судоку;

