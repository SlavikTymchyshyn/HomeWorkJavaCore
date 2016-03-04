package homeZooClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

public class ZooClub {
	
	private Map<Person, List<Pet>> map;

	public ZooClub() {
			this.map = new HashMap<>(); 
	}
	
	public  String stringType() {
		String str = null;
		Scanner scStr = new Scanner(System.in);
		str = scStr.next();
		return str;
	}
	
	public  Integer typeInt() {
		Integer i;
		String str = null;
		Scanner scInt = new Scanner(System.in);
		String regex = "[0-9]{1,2}";
		while (scInt.hasNext()) {

			str = scInt.next();
			if (str.isEmpty()) {
				return 0;
			} else if (str != null && str.matches(regex)) {
				i=Integer.parseInt(str);
				if(i==0){System.out.println("enter between 1-99");
				return 0;}else
				return Integer.parseInt(str);
			} else {
				System.out.println("enter between 1-99");
				return 0;
			}
		}
		return Integer.parseInt(str);
	}
	
//		Додати учасника клубу
	public void addPerson2(Map<Person, List<Pet>> map){
		System.out.println(map);
		map.put(new Person(), new ArrayList<>());
		System.out.println(map);
	}
	public void addPerson(Map<Person, List<Pet>> map){
		System.out.println(map);
		map.putIfAbsent(new Person(), new ArrayList<>());
		System.out.println(map);
	}
	public void addPersonLambda(Map<Person, List<Pet>> map){
		map.entrySet().forEach(System.out::println);
//		map.entrySet().iterator().forEachRemaining(p->p.getValue().add(new Pet("jkhjk","hjk")));//addPet to all
//		map.forEach((BiConsumer<? super Person, ? super List<Pet>>) map.putIfAbsent(new Person(), new ArrayList<>()));
		
		map.entrySet().forEach(System.out::println);
	}
	//for Each Remaining-для каждого оставшегося
	
//	List<String> newlist=list.stream().map((p)->p.getName())
//	.collect(Collector.toList());
	//створюэ newlist в який скидає імена персонів з ліста(list) персонів	
	
	
	
	
//		Додати тваринку до учасника клубу
	
	public void addPetToPersonLambda(Map<Person, List<Pet>> map){
		map.entrySet().forEach(System.out::println);
		
		System.out.println();
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		System.out.println("what pet:");
		String animal=stringType().toLowerCase();
		System.out.println("name pet:");
		String nameAnimal=stringType().toLowerCase();
		try{
		map.entrySet().stream().filter(p->p.getKey().getName().equalsIgnoreCase(name)).iterator().next().getValue().add(new Pet(animal,nameAnimal));
			}
		catch(NoSuchElementException e){System.err.println("NoSuchElementException");}
		map.entrySet().forEach(System.out::println);
	}
	
	public void viewListOfPersons(Map<Person, List<Pet>> map){
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt=set.iterator();
		while(entrIt.hasNext()){
			Entry<Person, List<Pet>> entry=entrIt.next();
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue()+" ");
		}
	}
	
	public Person checkIfPersonExist(Map<Person, List<Pet>> map){
		Person p=null;
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<Person, List<Pet>> entry1=entrIt1.next();
			if(entry1.getKey().getName().toLowerCase().equals(name)){
				p=entry1.getKey();}
//			else{System.out.println("there are no such Person");}
		}
		return p;
	}
	
	public void addPetToPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p=checkIfPersonExist(map);
		
		System.out.println("what pet:");
		String animal=stringType().toLowerCase();
		System.out.println("name pet:");
		String nameAnimal=stringType().toLowerCase();
		if(map.get(p).equals(null)){
		map.put(p,new ArrayList<>());
		map.get(p).add(new Pet(animal,nameAnimal));}
		else{
			map.get(p).add(new Pet(animal,nameAnimal));
			}
		System.out.println(map);
		}

		
//		Видалити тваринку з учасника клубу
	public void delPetFromPersonLambda(Map<Person, List<Pet>> map){
		map.entrySet().forEach(System.out::println);
		
		System.out.println();
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		System.out.println("what pet:");
		String animal=stringType().toLowerCase();
		
		try{
		map.entrySet().stream().filter(p->p.getKey().getName().equalsIgnoreCase(name)).iterator().next().getValue().removeIf(pt->pt.getAnimal().equalsIgnoreCase(animal));
		}
		catch(NoSuchElementException e){System.err.println("NoSuchElementException");}
		map.entrySet().forEach(System.out::println);
	}
	
	
	
	public void delPetFromPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p1=checkIfPersonExist(map);
		
		System.out.println("Введіть яку тваринку хочете Видалити:");
		String animal=stringType().toLowerCase();
//		System.out.println(map.get(p1));
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt1=set.iterator();
		while(entrIt1.hasNext()){
			Entry<Person, List<Pet>> entry1=entrIt1.next();
			if(entry1.getKey().equals(p1)){
				Iterator <Pet> itvalUe=entry1.getValue().iterator();
				while(itvalUe.hasNext()){
					Pet tmp=itvalUe.next();
					if(tmp.getAnimal().equalsIgnoreCase(animal)){
						itvalUe.remove();
						}
					}
				}
			}
		System.out.println(map);
	}
	
	
	
//		Видалити учасника клубу
	public void delPerson(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		Person p2=checkIfPersonExist(map);
		
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<Person, List<Pet>> entr2=entrIt2.next();
			if(entr2.getKey().equals(p2)){
				entrIt2.remove();
			}
		}
		viewListOfPersons(map);
	}
	
	public void delPersonLambda(Map<Person, List<Pet>> map){
		map.entrySet().forEach(System.out::println);
		System.out.println("choose one of members above:");
		String name=stringType().toLowerCase();
		map.entrySet().removeIf(p->p.getKey().getName().equalsIgnoreCase(name));
		map.entrySet().forEach(System.out::println);
	}
	
	
	
//		Видалити конкретну тваринку зі всіх власників
	
	public void delPetFromAllLambda(Map<Person, List<Pet>> map){
		map.entrySet().forEach(System.out::println);
		System.out.println("Введіть яку тваринку хочете Видалити:");
		String animal=stringType().toLowerCase();
		map.entrySet().iterator().forEachRemaining(p->p.getValue().removeIf(pet->pet.getAnimal().equalsIgnoreCase(animal)));//delPet from all
		map.entrySet().forEach(System.out::println);
	}

	public void delPetFromAll(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		System.out.println("Введіть яку тваринку хочете Видалити:");
		String animal=stringType().toLowerCase();
		
		Set<Entry<Person, List<Pet>>> set=map.entrySet();
		Iterator<Entry<Person, List<Pet>>> entrIt2=set.iterator();
		while(entrIt2.hasNext()){
			Entry<Person, List<Pet>> entr2=entrIt2.next();
			Iterator <Pet> itvalue=entr2.getValue().iterator();
				while(itvalue.hasNext()){
					Pet tmp=itvalue.next();
					if(tmp.getAnimal().toLowerCase().equals(animal)){
						itvalue.remove();
				}
			}
		}
		viewListOfPersons(map);
	}
	
//		Вивести на екран зооклуб
	public void seeMapZoo(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
	}
	
//	Реалізувати консольне меню, таким чином щоб можна було:
	public void menu(Map<Person, List<Pet>> map){
		viewListOfPersons(map);
		System.out.println();
		do{
			System.out.println("1.Додати учасника клубу");
			System.out.println("2.Додати тваринку до учасника клубу");
			System.out.println("3.Видалити тваринку з учасника клубу");
			System.out.println("4.Видалити учасника клубу");
			System.out.println("5.Видалити конкретну тваринку зі всіх власників");
			System.out.println("6.Вивести на екран зооклуб");
			System.out.println("7.Вийти з програми");
			System.out.println();
			System.out.println("choose number:");
			int menu=typeInt();
		switch(menu){
		case 1:{addPerson(map);
		break;}
		case 2:{addPetToPerson(map);
		break;}
		case 3:{delPetFromPerson(map);
		break;}
		case 4:{delPerson(map);
		break;}
		case 5:{delPetFromAll(map);
		break;}
		case 6:{seeMapZoo(map);
		break;}
		case 7:{System.exit(0);}
			}	
		}
		while(true);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ZooClub map=" + map + "\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
