package homeSql;

import java.util.List;

public class Tovar {
	
	private int id;
	
	private Category category;
	
	private Manufacturer manufacturer;
	
	private String modelName;
	
	private String detail;
	
	private double price;
	
	private int amountSklad;
	
	private List<Buy> buys;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmountSklad() {
		return amountSklad;
	}

	public void setAmountSklad(int amountSklad) {
		this.amountSklad = amountSklad;
	}

	public List<Buy> getBuys() {
		return buys;
	}

	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}
	
	

}
