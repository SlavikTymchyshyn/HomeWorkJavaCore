package less4;

public class Grandproba {

	static void print(int[][] a1) {
		System.out.println();
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				if (j == 0) {
					System.out.print("   " + a1[i][j] + " ");
				}

				else if (a1[i][j] < 10) {
					System.out.print(a1[i][j] + " ");
				}

				else {
					System.out.print(a1[i][j]);
				}
			}
			System.out.println();
		}
	}

	static int[][] mass(int size, int size2) {
		int[][] a1 = new int[size][size2];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				if (j == 0 || i == 0) {
					a1[i][j] = 1;
				} else if (i == size - 1) {
					a1[i][j] = 1;
				} else if (j == size2 - 1) {
					a1[i][j] = 1;
				} else if (i < a1.length && j < a1[i].length) {
					a1[i][j] = 0;
				}
			}
		}
		return a1;
	}

	static int[][] mass2(int s, int s2) {
		int[][] a2 = new int[s][s2];

		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				if (j == 0) {
					a2[i][j] = i;
				} else if (i == 0) {
					a2[i][j] = j;
				} else if (i == s - 1) {
					a2[i][j] = j + i;
				} else if (j == s2 - 1) {
					a2[i][j] = i + j;
				} else if (i < a2.length || j < a2[i].length) {
					a2[i][j] = 8;
				}
			}
		}
		return a2;
	}

	static int posl(int s, int s2) {
		int num = 2 * (Math.max(s, s2) + Math.min(s, s2)) - 4;
		return num;
	}

	public static void main(String[] args) {
		print(mass(3, 15));
		print(mass2(5, 3));
		print(mass2(10, 20));
	}
}
