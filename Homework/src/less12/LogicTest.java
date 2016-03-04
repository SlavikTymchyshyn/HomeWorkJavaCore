package less12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import less12.Person;

import org.junit.Assert;
import org.junit.Test;

public class LogicTest {

	@Test
	public void addTest(){
		int actual = Logic.add(2, 3);
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void changeNameTest(){
		Person p = new Person("Ivan", 18);
		String expected = "Vasyl";
		Logic.changeName(p, expected);
		String actual = p.getName();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void filterByAgeLessThenTest(){
		List<Person> expected = new ArrayList<>();
		expected.addAll(Arrays.asList(new Person("Ivan", 21),
				new Person("Ivan", 35)));
		List<Person> actual = new ArrayList<>();
		actual.addAll(Arrays.asList(new Person("Ivan", 21),
				new Person("Ivan", 35),
				new Person("Ivan", 17)));
		Logic.filterByAgeLessThen(actual, 18);
		Object[] expecteds = expected.toArray();
		Object[] actuals = actual.toArray();
		Assert.assertArrayEquals(expecteds, actuals);
	}
}
