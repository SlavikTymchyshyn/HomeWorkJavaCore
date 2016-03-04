package less18;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Integer> print(List<? extends Entity> list) {
		List<Integer> listIds = new ArrayList<>();
		for (Entity entity : list) {
			listIds.add(entity.getId());
		}
		return listIds;
	}

	public static <E> E add(E e) {
		return e;
	}

	public static void changeString(char c, String s) {
		try {
			Field f = s.getClass().getDeclaredField("value");
			f.setAccessible(true);
			char[] chars = s.toCharArray();
			try {
				f.set(s, c);
				System.out.println(s);
			} catch (IllegalArgumentException | IllegalAccessException e) {
			}

		} catch (NoSuchFieldException | SecurityException e) {
		}
	}

	public static void main(String[] args) {
		// Container<String> c = new Container<String>();
		// c.setElement("asd");
		// System.out.println(c.getElement());
		changeString('s', "aaaa");
	}
}
