package less3;

public class Examle3 {

	static int[][] oneZero() {
		int[][] asdf = new int[9][9];
		for (int i = 0; i < asdf.length; i++) {
			for (int j = 0; j < asdf[i].length; j++) {
				if (i > j) {
					asdf[i][j] = 1;
				} else {
					asdf[i][j] = 0;
				}
			}
		}
		return asdf;
	}

	static void printer(int[][] asdf) {
		System.out.println();
		for (int i = 0; i < asdf.length; i++) {
			for (int j = 0; j < asdf[i].length; j++) {
				if (j == 0) {
					System.out.print(" " + asdf[i][j] + " ");
				} else {
					System.out.print(asdf[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printer(oneZero());
	}
}
