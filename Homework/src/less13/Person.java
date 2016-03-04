package less13;

public class Person implements Comparable<Person>{
	 
	private String name;
	private int age;

	public Person(){}
	
	public Person(String name,int age) {
		this.name = name;
		this.age=age;
	}
	
	public void ChangenameInP(String newname){//переймонування name
		System.out.println("old name is "+this.name);
		this.name=newname;
		System.out.println("new name is "+this.name);
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
		result = prime * result + age;
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
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
//	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);   // sort by name
//	}
	public int compareTo(Person o) {
		return this.age-o.age;   // sort by age(-1-object less then typed(цей буде вище); 0-equal(буде зайвий), 1-obj is greater then typed(цей буде нижчий)) 
	}
		 
	 
}
