package less2;

public class Massives {

	public static void main(String[] args) {
		int[] array = new int[50];
		array[0] = 1;
		array[1] = 2;
		array[2] = 2;
		array[3] = 2;
		for (int i = 0; i < 10; i++) {
			array[i] = i + 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}

		char[] mass = new char[3];
		mass[0] = 'r';
		mass[1] = 'j';
		mass[2] = 'h';
		for (int i = 0; i < 3; i++) {
			System.out.println(mass);
		}

		// 2������� ����� �����
		int[][] twoArray = new int[10][10];
		for (int i = 0; i < 10; i++) {for (int j = 0; j < 10; j++) {twoArray[i][j] = (i+1) * (j+1);}		}
		for (int i = 0; i < 10; i++) {for (int j = 0; j < 10; j++) {if (twoArray[i][j] < 10) {System.out.print(twoArray[i][j] + "  ");
				} else {System.out.print(twoArray[i][j] + " ");	}}
			System.out.println();
			
		}
	}


// for(int i=0;i<10;i++){for(int
// j=0;j<10;j++){System.out.print(twoArray[i][j]);}

// public static void mainer(String[] args) {
static int calc(int a,int b, char c){
	switch (c){
	case '*':{return a*b;}
	case '-':{return a-b;}
}

return 0;
}

static int[] masiv(){
	int[] array1 = new int[10];
	for (int i = 1; i < 10; i++) {
		array1[i] = i + 1;}
		return array1;
}}
//int[] arraymas =masiv();
//System.out.print(arraymas[i]); -- �� �� ������� ���� ���� �� "public static void main(String[] args) {" 
