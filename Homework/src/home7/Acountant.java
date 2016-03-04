package home7;

public class Acountant {
	static void print(Worker w){
		System.out.println(w.getClass().getSimpleName()+"- Зарплата= "+w.Zp()+"- премія= "+w.premia());
	}
	public static void main(String[] args) {
		System.out.println();
		Monthworker trudjaga=new Monthworker();
		Hourworker frilanser=new Hourworker(450);
		Hourworker frilanser2=new Hourworker(600);
		Hourworker frilanser3=new Hourworker(800);
		frilanser.zarplata();
		frilanser2.zarplata();
		frilanser3.zarplata();
		trudjaga.zarplata();
//		System.out.println(trudjaga);
//		System.out.println(frilanser);
//		System.out.println(frilanser2);
//		System.out.println(frilanser3);
		System.out.println();
		System.out.println("static void методом print вище");
		print(new Hourworker(450));
		print(new Hourworker(600));
		print(new Hourworker(800));
		print(new Monthworker());
	}

}
