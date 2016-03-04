package homeZooClub;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person implements Serializable,Comparable<Person>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5731045440980754578L;
	private List<Pet> pets=new ArrayList<>();
	private String name;
	private int age;

	public Person(String name,int age) {
		this.name = name;
		this.age=age;
	}
	public Person(){
		addPerson();
	} 
	
//	public Person(String newName){
//		if (newName.equalsIgnoreCase(new Person().getName())){
//			new Person(getName(),getAge());
//		}else{System.out.println("there no such Person");}
//	}
	
	public Person addPerson(){
		System.out.println("¬вед≥ть ≥м€ учасника");
		String newname=stringType();
		System.out.println("¬вед≥ть в≥к учасника");
		int newage=typeInt();
		this.name=newname;
		this.age=newage;
		return new Person(newname,newage);
	}
	
	public String stringType() {
		String str = null;
		Scanner scStr = new Scanner(System.in);
		str = scStr.next();
		return str;
	}
	
	public int typeInt1(){
		String str = null;
		Integer i;
		Scanner scInt = new Scanner(System.in);
		str = scInt.next();
		i=Integer.parseInt(str);
		return i;
	}
	
	public Integer typeInt() {
		Integer i;
		String str = null;
		Scanner scInt = new Scanner(System.in);
		String regex = "[0-9]{2}";
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person (name is " + name + ", age= "+age+")";
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);   // sort by name
	}
//	public int compareTo(Person o) {
//		return this.age-o.age;   // sort by age(-1-object less then typed(цей буде вище); 0-equal(буде зайвий), 1-obj is greater then typed(цей буде нижчий)) 
//	}
		 
	 
}
