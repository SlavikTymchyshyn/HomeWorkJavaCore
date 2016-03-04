package less5;

public class Home {

	static String str(String a) {
		// a =new String("Hello");
		char[] f = a.toCharArray();
		for (int i = 0; i < f.length; i++)// нема значення як перераховувати
											// елементи ззаду чи спереді має
											// значення нижня команда
		{
			f[i] = a.charAt(f.length - i - 1);
		}
		// a=new String(f);
		// a=f.valueOf(charArray);
		return new String(f);
	}

	// перевертає стрічку - читає задом наперед

	static void reverse(String str) { // 2й метод записання стрічки наоборот
		char[] first = str.toCharArray();
		char[] second = new char[first.length];
		for (int i = 0; i < first.length; i++) {
			second[first.length - 1 - i] = first[i];
		}
		if (str.contains(new String(second))) {
			System.out.println(str + " <--symetric By Void Method--> "
					+ new String(second));
		} else {
			System.out.println(new String(second));
		}
	}

	// пустий метод який визначає чи симетрична стрічка

	public static void main(String[] args) {
		/*
		 * String d =new String("Hello Its your new text"); char
		 * []g=d.toCharArray(); for(int
		 * i=g.length-1;i>=0;i--){g[i]=d.charAt(i);System.out.print(g[i]);}
		 * //виводить масив оберненого порядку стрічки System.out.println();
		 * d=new String (g); System.out.print(d);
		 */
		// for(int i=0;i<f.length;i++){System.out.print(f[i]);}
		// for (int i=a.length();i>=0;i--){f[i]=a.charAt(i);}

		String a = new String("pадаp");
		if (a.contains(str(a))) {
			System.out.println(a + " <--symetric--> " + str(a));
		} else {
			System.out.println(str(a));
		}
		// провірка на симетричність фрази

		// System.out.print(str(a));
		System.out.println();
		reverse("ядовитий");
	}
}
// написпти поляндром метод перевірки чи фраза симетрична