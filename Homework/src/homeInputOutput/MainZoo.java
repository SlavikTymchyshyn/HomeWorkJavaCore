package homeInputOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MainZoo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map <Person, List<Pet>> map=new HashMap<>();
		Person p1=new Person("Vasya",23);
		Person p2=new Person("Olya", 23);
		Person p3=new Person("Petro", 34);
		Person p4=new Person("Olena", 45);
		Person p5=new Person("Ira", 15);
		List<Person> persList=new ArrayList<>();
		persList.add(p1);
		persList.add(p2);
		persList.add(p3);
		persList.add(p4);
		persList.add(p5);
		
//		System.out.println(persList);
		System.out.println();
		
		map.put(new Person("Vasya",23), new ArrayList<>());
		map.get(p1).add(new Pet("dog","Sharik"));
		map.get(p1).add(new Pet("cat","Sadon"));
		map.put(new Person("Olya", 23), new ArrayList<>());
		map.get(p2).add(new Pet("rat","Fir"));
		map.get(p2).add(new Pet("cat","Los"));
		map.put(new Person("Petro", 34), new ArrayList<>());
		map.get(p3).add(new Pet("rat","Best"));
		map.get(p3).add(new Pet("cat","Kold"));
		map.put(new Person("Olena", 45), new ArrayList<>());
		map.get(p4).add(new Pet("bober","Fiory"));
		map.get(p4).add(new Pet("dog","Rex"));
		map.put(new Person("Ira", 15), new ArrayList<>());
		map.get(p5).add(new Pet("dog","Rjabko"));
		map.get(p5).add(new Pet("fishes","Akula"));
		
		ZooClub z=new ZooClub();
//		z.addPerson(map);
//		z.serializacia(map);
		z.deSerializacia(map);
		
		
//		System.out.println(map.entrySet().iterator().next().toString());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
