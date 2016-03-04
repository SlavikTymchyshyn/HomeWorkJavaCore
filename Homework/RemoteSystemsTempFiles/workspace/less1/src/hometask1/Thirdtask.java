package hometask1;

public class Thirdtask {
	static int add(int a,int b){
		return a+b;
		}
		
	static int minus(int a,int b){
		return a-b;
		
		}
	static int mnozhn(int a,int b){
		return a*b;
		
		}
	static double divide(int a,int b){
		return a/b;
		}
	public static void main(String[] args) {
	char znak;
	znak = '-';
	int a = 12;
	int b = 4;
		
	//	double c =divide(12,4,'+');
	//	System.out.println(c);}}
    //43+42*45-47/
	switch (znak) {
	case '+': {
		System.out.print("in case a + b = "+add(a,b));
		break;
	}
	case '-': {
		System.out.print("in case a - b = "+minus(a,b));
		break;
	}
	case '*': {
		System.out.print("in case a * b = "+mnozhn(a,b));
		break;
	}
	case '/': {
		System.out.print("in case a / b = "+divide(a,b));
		break;
	}
	default: {
		System.out.print("ERROR: empty or incorrect character " +znak);
		}
	
    }}}

    
	
	



