package less3;

public class Mass {

	public static void main(String[] args) {
		int[] asdf = new int[10];
		int n = 0;
		for (int i = 0; i < asdf.length; i++) {
			n += 2;
			asdf[i] = n;
			asdf[i] = 2 * (i + 1);
			System.out.println(asdf[i]);
		}
		// qwer.lenght - це довжина масиву
	}

}
