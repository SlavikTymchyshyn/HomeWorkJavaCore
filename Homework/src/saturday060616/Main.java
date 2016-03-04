package saturday060616;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import saturday060616.Bmw.B;

public class Main {
	
	
	static <E>  E add(E e){
		return e;
	}
	
	static void printCarMethods(Car car){
		car.drive();
		car.stop();
	}
	
	static void sort(Comparator<Person> comparator, List<Person> list){
		if(comparator==null){
			boolean isSorted = false;
			while(!isSorted){
				int n = 0;
				for(int i = 1; i < list.size(); i++){
					Comparable<Person> c = list.get(i-1);
					if(c.compareTo(list.get(i))>0){
						
					}
				}
			}
		} else {
			list.sort(comparator);
		}
	}

	public static void main(String[] args) {
		java.util.Set<Car> set = new java.util.HashSet<Car>();
		Car car = new Audi(4, "Petro", 43);
		Car car2 = new Bmw();
		Bmw bmw = (Bmw) car2;
		Bmw.A a = bmw.new A();
		Bmw.B b = new B();
		List<Car> list = new ArrayList<>();
		list.add(car);
		list.add(car2);
		for (Car car3 : list) {
			printCarMethods(car3);
		}
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Ivan", 17));
		persons.add(new Person("Petro", 25));
		persons.add(new Person("Mykola", 15));
		System.out.println(persons);
		persons.sort(null);
		System.out.println(persons);
		persons.sort(new ComparatorByNameAsc());
		System.out.println(persons);
		persons.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		System.out.println(persons);
	}

}
