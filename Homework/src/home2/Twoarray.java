package home2;

public class Twoarray {

	public static void main(String[] args) {
		int twoar[][] = new int[9][9];
		for (int i = 0; i < twoar.length; i++) {
			for (int j = 0; j < twoar[i].length; j++) {
				if (j < 3) {
					twoar[i][j] = i + 1;
				} else if (i < 3) {
					twoar[i][j] = j + 1;
				} else if (j > 3) {
					twoar[i][j] = i;
				} else if (i > 3) {
					twoar[i][j] = j;
				}
				System.out.print(twoar[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 * ��������� ����� for � for � �� ����� System.out.println() ����� ��� ��� ����
 * ��� ����� ��� ������� ����� j-�(20�);
 */

