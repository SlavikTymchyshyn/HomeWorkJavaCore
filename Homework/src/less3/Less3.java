package less3;

public class Less3 {
	static double[] autoCreate(int size) {
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 10 + 5;
			// Math.random() повертаэ по замовчуванню выд 0 до 1 default тому
			// *10+5 для різноманіття тобто будуть значення від 5 до 15
		}
		return array;

	}

	public static void main(String[] args) {
		double[] array = autoCreate(10);
		for (double element : array) {
			System.out.println(element);
		}

	}
	// for each листає все від початку докінця тобто значення дасть як є він не
	// вміє їх міняти
}
