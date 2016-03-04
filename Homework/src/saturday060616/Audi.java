package saturday060616;

public class Audi implements Car{
	
	private Wheels wheels;
	private Person person;
	
	public Audi(int count, String name, int age) {
		wheels = new Wheels(count);
		person = new Person(name, age);
	}

	@Override
	public void drive() {
		System.out.println("Audi: brum-brum");
		
	}

	@Override
	public void stop() {
		System.out.println("Audi: eeeeee-eeeeee");
	}

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	
	

}
