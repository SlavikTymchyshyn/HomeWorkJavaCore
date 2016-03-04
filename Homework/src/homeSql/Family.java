package homeSql;

import java.util.List;

public class Family {
	
	private int id;
	
	private String surname;
	
	private List<Customer> customers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return surname;
	}

	public void setName(String name) {
		this.surname = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	

}
