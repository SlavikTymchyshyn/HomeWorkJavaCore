package home2;

public class Task2 {

	public static void main(String[] args) {
		int[] ar2 = new int[50];
		for (int i = 0; i < 50; i++) {
			ar2[i] = i * 2 + 1;
			System.out.print(ar2[i] + " ");
		}
		System.out.println();

		for (int i = 49; i > -1; i--) {
			ar2[i] = i * 2 + 1;
			System.out.print(ar2[i] + " ");
		}
	}

}