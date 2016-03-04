package less3;

public class Example2 {

	public static void main(String[] args) {
		int[][] kv = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				kv[i][j] = 0;
			}
		}
		int x = 0;
		int y = 0;
		boolean leftRight = true;
		boolean rightLeft = false;
		boolean upDown = false;
		boolean downUp = false;
		int desc = 10;
		int asc = -1;
		for (int n = 1; n < 100; n++) {
			// BJava логический литерал true не равен 1, а литерал false - О а
			// нижче leftRight && kv[x][y] == 0 ?
			if (leftRight && kv[x][y] == 0) {
				kv[x][y] = n;
				y++;
				if (y == desc) {
					y--;
					n++;
					leftRight = false;
					upDown = true;
					x++;
				}
			}
			if (upDown && kv[x][y] == 0) {
				kv[x][y] = n;
				x++;
				if (x == desc) {
					x--;
					n++;
					upDown = false;
					rightLeft = true;
					y--;
					desc--;
				}
			}
			if (rightLeft && kv[x][y] == 0) {
				kv[x][y] = n;
				y--;
				if (y == asc) {
					y++;
					n++;
					rightLeft = false;
					downUp = true;
					x--;
					asc++;
				}
			}
			if (downUp && kv[x][y] == 0) {
				kv[x][y] = n;
				x--;
				if (x == asc) {
					x++;
					downUp = false;
					leftRight = true;
					y++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (kv[i][j] >= 10) {
					System.out.print(kv[i][j] + " ");
				} else {
					System.out.print(kv[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}

}
