package less5;

public class Main2 {

	public static void main(String[] args) {
		String a = "Hello";// a,b,c- э посилання(адреса) на стрічки
		String b = "Hello";// без new стрічка шукає стрічку в памяті з тою самою
							// к-тю поверхів і вона присвоїть тій змінній ту ж
							// саму адресу
		String c = new String("Hello");// буде інша адреса ніж в двох попередніх
		int length = a.length();
		System.out.println(length);
		a = b + c;
		System.out.println(a);
		a = b.concat(c);// concat це те саме що + тобто додавання стрічок
						// простіше +; Null pointer exception помилка при
						// виклику обэкта який ще не заініціалізований тобто ще
						// без значення
		a = a.replaceAll("lo", " fuck ");// метод що міняє в стрічці букви
		System.out.println(a);
		char[] f = a.toCharArray();// метод який перевертаэ стрічку в масив char
		a = new String(f);// написати метод який буде розвертати стрічку в
							// зворотньому порядку (за допомогою 2х останніх
							// строк)
	}

}
