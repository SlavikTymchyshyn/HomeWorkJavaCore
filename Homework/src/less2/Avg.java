package less2;

public class Avg {

	public static void main(String[] args) {
		// int[]a=new int[5];
		int a[] = { 4, 5, 2, 6, 15 };
		int res = 0;
		for (int i = 0; i < 5; i++) {
			res +=a[i];
		}
		int avg = res / a.length;
		System.out.println(avg);

	}

}
