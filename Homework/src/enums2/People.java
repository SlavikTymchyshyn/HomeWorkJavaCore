package enums2;

public enum People {
	
	Natasha("Natasha",36), Luda("Luda",25), sergij("Sergij",30), Oleg("Oleg",25);
	
	private People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + People.this.getName() + " Age "+ People.this.getAge() ;
	}
	
}
