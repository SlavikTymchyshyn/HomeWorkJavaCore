package homeSql;

import java.util.List;

public class Category {
	
	private int id;
	
	private String name;
	
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

	public List<Tovar> getTovars() {
		return tovars;
	}

	public void setTovars(List<Tovar> tovars) {
		this.tovars = tovars;
	}
	
	
}
