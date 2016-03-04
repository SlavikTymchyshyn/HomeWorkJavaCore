package less7;

public class Main {

	static void print(Geometric g) { // 1 stroke
		// double square =g.square();
		// double perimetr =g.perimetr();
		System.out.println(g.getClass().getSimpleName() + " площа = "
				+ g.square() + " периметр=" + g.perimetr());
	}

	public static void main(String[] args) {
		// Rectangle r=new Rectangle (3.2,5.6);
		// double square =r.square();
		// double perimetr = r.perimetr();
		// System.out.println("площа = "+square+" периметр="+perimetr);
		//
		// Circle c=new Circle(4.8);
		// square =c.square();
		// perimetr = c.perimetr();
		// System.out.println("площа Circle= "+square+" периметр Circle="+perimetr);
		//
		// Kvadrate k=new Kvadrate(2);
		// square =k.square();
		// perimetr = k.perimetr();
		// System.out.println("площа Kvadrate= "+square+" периметр Kvadrate="+perimetr);
		//
		Geometric geometric = new Rectangle(3.2, 5.6); // object of interface
														// named 'Geometric' -
														// тут то саме що в 1
														// строці(1 stroke)
		// тому що обэкт-клас Rectangle розширяється(implements) інтерфейсом
		// Geometric

		Geometric g = new Circle(5.6);// a mona prosto "g" nazvaty

		print(new Rectangle(3.2, 5.6));
		print(new Circle(5.6));
		print(new Kvadrate(6));
		System.out.println(g.perimetr());
		System.out.println(g.square());
	}
}
