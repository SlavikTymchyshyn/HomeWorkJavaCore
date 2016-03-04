package less8;

public class Room {

	private int number;

	private Person person;// це означає що у цьому класі є доступ до полів класу
							// Person

	public Room(int number, Person person) {

		this.number = number;
		this.person = person;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", person=" + person + "]";
	}

}
