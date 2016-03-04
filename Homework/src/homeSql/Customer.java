package homeSql;

import java.util.List;

public class Customer {
	
	private int id;
	
	private Family family;
	
	private Named named;
	
	private List<Buy> buys;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Named getNamed() {
		return named;
	}

	public void setNamed(Named named) {
		this.named = named;
	}

	public List<Buy> getBuys() {
		return buys;
	}

	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}
	
	
}
