package less8;

import java.util.Arrays;

public class Building {

	private int number;

	private String address;

	private Floor[] floors;

	public Building(int number, String address, int floorscount) {
		this.number = number;
		this.address = address;
		floors = new Floor[floorscount];
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "Building [number=" + number + ", address=" + address
				+ ", floors=" + Arrays.toString(floors) + "]";
	}

}
