package homeSql;

import java.util.List;

public class Adress {
	
	private int id;
	
	private String nameAdress;

	private List<Location> locations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAdress() {
		return nameAdress;
	}

	public void setNameAdress(String nameAdress) {
		this.nameAdress = nameAdress;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	
	
	
}
