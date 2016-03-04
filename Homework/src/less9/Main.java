package less7;

public class Main {

	static String reverse(String str) {
		char[] old = str.toCharArray();
		char[] newArray = new char[old.length];
		for (int i = 0; i < old.length; i++) {
			newArray[i] = old[old.length - 1 - i];
		}
		str = new String(newArray);
		return str;
	}

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		String d = new String("Hello");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c == d);
		char[] aa = a.toCharArray();
		System.out.println(aa);
		a = new String(aa);
		System.out.println(a);
		a = reverse(a);
		System.out.println(a);
		char s = a.charAt(3);
		System.out.println(s);
		int i = a.compareToIgnoreCase(c);
		System.out.println(i);
		System.out.println((int) 'o' - (int) 'h');
		System.out.println("Hello".compareTo("Hellojdfhdhf"));

		System.out.println(b.concat(c));
		System.out.println(b + c);

		System.out.println("" != null);
		System.out.println(a.isEmpty());
		if ((a != null) && (a.isEmpty()))
			if ((a != null) && (a.equals(c)))
				System.out.println(c.equals(d));

		System.out.println(a.endsWith("eH"));

		System.out.println(c.startsWith("He"));

		System.out.println(a.indexOf("eH"));
		System.out.println(a.substring(1, 4));
		System.out.println(del("Hello", 'l'));
		System.out.println("Hello".replaceAll("l", ""));
	}

	static String del(String str, char del) {
		int index = str.indexOf(del);
		while (index != -1) {
			str = str.substring(0, index) + str.substring(index+1, str.length());
			index = str.indexOf(del);
		}
		return str;
	}
}
