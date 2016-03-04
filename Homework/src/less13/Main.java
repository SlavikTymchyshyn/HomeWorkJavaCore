package less13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
//		Set<String> set2=new LinkedHashSet<>(); //виводить в тому ж порядку що і вводили
		set.add("ASUS");
		set.add("Adsfgd");
		set.add("xcvcA");
		set.add("Acz");
		set.add("Accz");
		System.out.println(set);
		System.out.println("ASUS".hashCode());
		System.out.println("Adsfgd".hashCode());
				
		Set<Person> sortedSet=new TreeSet<>();
//		Set<Person> sortedSet=new TreeSet<Person>(new MyComparator()); // тільки в TreeSet можна так добавляти компратор
		sortedSet.add(new Person("Ivan",18));
		sortedSet.add(new Person("Petro",16));
		sortedSet.add(new Person("Petro",18)); //виводить тільки один Петро бо ми сортували по імені 
		sortedSet.add(new Person("Artur",38));
		sortedSet.add(new Person("Igor",28));
		System.out.println(sortedSet);
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Igor",28));
		list.add(new Person("Ivan",18));
		list.add(new Person("Petro",16));
		list.add(new Person("Petro",18)); 
		list.add(new Person("Artur",38));
		System.out.println(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		//list.sort(new MyComparator()); // you can that in new versions of Java from java 8
		
		
		
		
		
		
		
	}
}
