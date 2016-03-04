package homeSql;

import java.util.List;

public class Manufacturer {
	
	private int id;
	
	private String name;
	
	private List<Location> location;
	
	private List<Tovar> tovars;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public List<Tovar> getTovars() {
		return tovars;
	}

	public void setTovars(List<Tovar> tovars) {
		this.tovars = tovars;
	}

	
}
