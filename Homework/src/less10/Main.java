package less10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list.contains(4));
		System.out.println(list.containsAll(Arrays.asList(4,4,6)));
		System.out.println(list.containsAll(Arrays.asList(4,7)));
		System.out.println(list.containsAll(list));
		int i = list.get(0);
		System.out.println(i);
		System.out.println(list);
		i = list.set(1, 7);
		System.out.println(list);
		System.out.println(i);
		for(int j = 0; j < list.size(); j++){
			System.out.print(list.get(j)+" ");
		}
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ivan", 17));
		persons.add(new Person("Petro", 21));
		persons.add(new Person("Petro", 22));
		persons.add(new Person("Mykola", 17));
		persons.add(new Person("Sergiy", 15));
//		for(int j = 0; j < persons.size(); j++){
//			if(persons.get(j).getName().equals("Petro")){
//				persons.remove(j);
//				j--;
//			}
//		}
//		for (Person person : persons) {
//			if(person.getName().equals("Petro")){
//				persons.remove(person);
//			}
//		}
		Iterator<Person> iter = persons.iterator();
		while(iter.hasNext()){
			Person person = iter.next();
			if(person.getName().equals("Petro")){
				iter.remove();
			}
		}
		System.out.println(persons);
	}
}
