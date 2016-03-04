package homeSql;

import java.util.List;

public class Buy {
	
	private int id;
	
	private List<Customer> Customers;
	
	private List<Tovar> Tovars;
	
	private int amount;
	
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Customer> getCustomers() {
		return Customers;
	}

	public void setCustomers(List<Customer> customers) {
		Customers = customers;
	}

	public List<Tovar> getTovars() {
		return Tovars;
	}

	public void setTovars(List<Tovar> tovars) {
		Tovars = tovars;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
