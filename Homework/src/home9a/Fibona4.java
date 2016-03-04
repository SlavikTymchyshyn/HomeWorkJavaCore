package home9a;

public class Fibona4 {
	
	void fibo(int n) {// not mine
		int i = 0;
		int a = 0;
		int b = 1;
		int sum_fib = 1;
		while (i++ < n) {
			System.out.print(sum_fib + " ");
			sum_fib = a + b;
			a = b;
			b = sum_fib;
		}
	}

	void fibomy(int n) {
		int i = 0;
		int a = 0;
		int b = 1;
		int s = 1;
		for (; i++ < n;) {
			System.out.print(s + " ");
			s = b + a;
			a = b;
			b = s;
		}
	}
	
	void Fibona44i() {
		int[] f = new int[11];
		for (int i = 0; i < f.length; i++) {
			switch (i) {
			case 0:
			case 1:
				f[i] = 1;
				System.out.print(f[i] + " ");
				break;
			default:
				f[i] = f[i - 1] + f[i - 2];
				System.out.print(f[i] + " ");
			}
		}
	}

	void Fibona44i2() {
		int a[] = new int[13];
		for (int i = 0; i < a.length - 2; i++) {
			if (i <= 1) {
				a[i] = 1;
				System.out.print(a[i] + " ");
			} else if (i > 1) {
				a[i] = a[i - 1] + a[i - 2];
				System.out.print(a[i] + " ");
			}
		}
	}

	void Fibona_3(int from,int to){
		double sF=Math.sqrt(5);
		double pos=(1+sF)/2;
		double neg=(1-sF)/2;
		int i=0;
		int n=to-from;
		while(i++<n){
			double F=((Math.pow(pos, from)-Math.pow(neg, from))/sF);
			System.out.format(" %.0f",F);
			from++;
			};
		System.out.println();
	}
	

}
	

