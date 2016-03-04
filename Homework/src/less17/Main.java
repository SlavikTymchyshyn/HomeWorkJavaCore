package less17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import less17.A.B;
import less17.A.C;

public class Main {
	
	static void asdf(int s){
		switch (s){
		case 1 :{
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			asdf(i);
			break;
		}
		}
	}

	public static void main(String[] args) {
		A a = new A();
		B b = a.new B();
		C c = new C();
		List<String> list = new ArrayList<>();
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		});
		
		int d = Person.a;
		
	}

}
