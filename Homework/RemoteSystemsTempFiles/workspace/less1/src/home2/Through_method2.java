package home2;

public class Through_method2 {

	 static int[] neparn_pr() {
		 int[] ar3 = new int[50];
			for (int i = 0; i < 50; i++) {
				ar3[i] = i*2 + 1;}
				return ar3;}
	 static int[] parn_pr() {
		 int[] ar3 = new int[50];
			for (int i = 0; i < 50; i++) {
				ar3[i] = i*2 + 2;}
				return ar3;	}
	 static int[] neparn_zv() {
		 int[] ar3 = new int[50];
			for (int i = 49; i>-1; i--) {
				ar3[i] = i*2 + 1;}
				return ar3;	}
	 static int[] parn_zv() {
		 int[] ar3 = new int[50];
			for (int i = 49; i>-1; i--) {
				ar3[i] = i*2 + 2;}
				return ar3;	}

public static void main(String[] args) {
	int m1[]=neparn_pr();
	for (int i = 0; i < 50; i++) {System.out.print(m1[i]+" ");}
	System.out.println();
	int m2[]=parn_pr();
	for (int i = 0; i < 50; i++) {System.out.print(m2[i]+" ");}
	System.out.println();
	int m3[]=neparn_zv();
	for (int i = 49; i>-1; i--) {System.out.print(m3[i]+" ");}
	System.out.println();
	int m4[]=parn_zv();
	for (int i = 49; i>-1; i--) {System.out.print(m4[i]+" ");}
}}