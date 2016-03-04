package less8;

public class Main {
//комрлзиція агрегація
	public static void main(String[] args) {
		Building building = new Building(5, "Gorodocka", 5);
		building.getFloors()[0] = new Floor(1, 0); // посилання на масив
													// поверхів в якому задаєм
													// що на першому(0-му)
													// поверсі 1 кімната
		System.out.println(building);
		building.getFloors()[1] = new Floor(4, 1);// на першому(1-му) поверсі 4
													// кімнатu
		System.out.println(building);
		building.getFloors()[1].getRooms()[0] = new Room(1, new Person(28,
				"Serg"));
		building.getFloors()[1].getRooms()[1] = new Room(2, null);
		building.getFloors()[1].getRooms()[2] = new Room(3, new Person(35,
				"Ira"));
		building.getFloors()[1].getRooms()[3] = new Room(4, new Person(23,
				"Olja"));
		System.out.println(building);

	}

}
