package home7;

public class Person {
	 private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void Changename(String newname){//переймонування name
		System.out.println("old name is "+name);
		name=newname;
		System.out.println("new name is "+name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	 
	 
}
