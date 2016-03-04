package less12;

import java.util.Iterator;
import java.util.List;

import less12.Person;

public class Logic {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static void changeName(Person p, String newName) {
		p.setName(newName);
	}

	public static void filterByAgeLessThen(List<Person> persons, int age) {
		Iterator<Person> iter = persons.iterator();
		while (iter.hasNext()) {
			if (iter.next().getAge() < age) {
				iter.remove();
			}
		}
	}
}
