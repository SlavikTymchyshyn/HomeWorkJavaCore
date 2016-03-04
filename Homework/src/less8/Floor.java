package less8;

import java.util.Arrays;

public class Floor {

	private int floorNumber;

	private Room[] rooms;

	public Floor(int roomsCount, int floorNumber) {
		rooms = new Room[roomsCount];
		this.floorNumber = floorNumber;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Floor [floorNumber=" + floorNumber + ", rooms="
				+ Arrays.toString(rooms) + "]";
	}

}
