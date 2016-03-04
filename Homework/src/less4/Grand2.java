package less4;

public class Grand2 {
	static int[][] m1square(int a) {
		int[][] qw = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				qw[i][j] = 0;
			}
		}
		boolean RL = true;
		boolean UD = false;
		boolean LR = false;
		boolean DU = false;
		int x = 0;
		int y = 0;
		int r = a;
		int rz = -1;
		for (int n = 1; n <= a * a; n++) {
			if (RL && qw[y][x] == 0) {
				qw[y][x] = n;
				x++;
				if (x == r) {
					x--;
					n++;
					RL = false;
					y++;
					UD = true;
				}
			}
			if (UD && qw[y][x] == 0) {
				qw[y][x] = n;
				y++;
				if (y == r) {
					y--;
					n++;
					UD = false;
					x--;
					r--;
					LR = true;
				}
			}
			if (LR && qw[y][x] == 0) {
				qw[y][x] = n;
				x--;
				if (x == rz) {
					x++;
					n++;
					y--;
					rz++;
					LR = false;
					DU = true;
				}
			}
			if (DU && qw[y][x] == 0) {
				qw[y][x] = n;
				y--;
				if (y == rz) {
					y++;
					x++;
					DU = false;
					RL = true;
				}
			}
		}
		return qw;
	}

	static int[][] m2rectangle(int a, int b) {
		int[][] qw = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				qw[i][j] = 0;
			}
		}
		boolean RL = true;
		boolean UD = false;
		boolean LR = false;
		boolean DU = false;
		int x = 0;
		int y = 0;
		int side = a;
		int topbot = b;
		int zv = -1;
		for (int n = 1; n <= (a * b); n++) {
			if (RL && qw[y][x] == 0) {
				qw[y][x] = n;
				x++;
				if (x == topbot) {
					x--;
					n++;
					topbot--;
					RL = false;
					y++;
					UD = true;
				}
			}
			if (UD && qw[y][x] == 0) {
				qw[y][x] = n;
				y++;
				if (y == side) {
					y--;
					n++;
					UD = false;
					x--;
					side--;
					LR = true;
				}
			}
			if (LR && qw[y][x] == 0) {
				qw[y][x] = n;
				x--;
				if (x == zv) {
					x++;
					n++;
					y--;
					zv++;
					LR = false;
					DU = true;
				}
			}
			if (DU && qw[y][x] == 0) {
				qw[y][x] = n;
				y--;
				if (y == zv) {
					y++;

					x++;
					DU = false;
					RL = true;
				}
			}
		}
		return qw;
	}

	static void print(int[][] c) {
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (c[i][j] < 10) {
					System.out.print(" " + c[i][j] + "   ");
				} else if (c[i][j] > 99) {
					System.out.print(" " + c[i][j] + " ");
				} else if (c[i][j] <= 99 && c[i][j] > 9) {
					System.out.print(" " + c[i][j] + "  ");
				} else if (j == 0) {
					System.out.print(" " + c[i][j] + " ");
				} else {
					System.out.print(c[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int m1[][] = m2rectangle(5, 10);
		int m2[][] = m1square(15);
		print(m1);
		print(m2);
	}
}
