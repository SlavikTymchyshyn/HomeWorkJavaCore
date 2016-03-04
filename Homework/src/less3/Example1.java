package less3;

public class Example1 {
	static void createKv(int xx, int yy) throws InterruptedException {
		int[][] kv = new int[xx][yy];
		for (int i = 0; i < xx; i++) {
			for (int j = 0; j < yy; j++) {
				kv[i][j] = 0;
			}
		}
		int x = 0;
		int y = 0;
		boolean isMoveUp = false;
		for (int n = 1; n <= (xx * yy); n++) {
			boolean check = true;
			if (check && x == 0 && y == 0 && kv[x][y] == 0) {
				kv[x][y] = n;
				check = false;
			}
			if (check && !isMoveUp) {
				if (y != (yy - 1) && kv[x][y + 1] == 0) {
					y++;
					kv[x][y] = n;
					check = false;
				}
			}
			if (check) {
				if (x != (xx - 1) && kv[x + 1][y] == 0) {
					x++;
					kv[x][y] = n;
					check = false;
				}
			}
			if (check) {
				if (y != 0 && kv[x][y - 1] == 0) {
					y--;
					kv[x][y] = n;
					check = false;
				}
			}
			if (check) {
				if (x != 0 && kv[x - 1][y] == 0) {
					x--;
					kv[x][y] = n;
					check = false;
					isMoveUp = true;
				} else {
					isMoveUp = false;
					n--;
				}
			}
			print(kv);
		}
	}

	static void print(int[][] array) throws InterruptedException {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] >= 100) {
					System.out.print(array[i][j] + " ");
				} else if (array[i][j] >= 10) {
					System.out.print(array[i][j] + "  ");
				} else {
					System.out.print(array[i][j] + "   ");
				}
			}
			System.out.println();
		}
		System.out.println();
		Thread.currentThread();
		Thread.sleep(100);
	}

	public static void main(String[] args) throws InterruptedException {
		createKv(20, 20);
	}

}
