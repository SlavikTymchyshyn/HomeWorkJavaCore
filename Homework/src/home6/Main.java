package home6;

public class Main {

	public static void main(String[] args) {
		Rectangle first = new Rectangle();
		Rectangle sec = new Rectangle(20.96, 45.78);
		Rectangle thrd = new Rectangle(89.99, 66.56);
		Rectangle fourth = new Rectangle(54.96, 21.19);
		Rectangle fifth = new Rectangle(10, 26.1);
		Rectangle six = new Rectangle(8, 8);

		System.out.println();
		// System.out.println(first);
		System.out.println("first width = " + first.getWidth());
		System.out.println("first length = " + first.getLength());
		System.out.println();
		System.out.println("All about thrd");
		// System.out.println(thrd); неправильно так писати
		thrd.SqPer();
		System.out.println();
		System.out.println("All about fourth");
		// System.out.println(fourth);
		fourth.SqPer();
		System.out.println();
		System.out.println("All about six");
		six.SqPer();
		System.out.println();
		System.out.println("sec Perimeter=" + sec.Perimeter());
		System.out.println();
		System.out.println("fifth Square = " + fifth.Square());

	}

}
