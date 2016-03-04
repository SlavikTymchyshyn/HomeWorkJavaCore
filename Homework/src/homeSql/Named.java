package homeSql;

import java.util.List;

public class Named {
	
	private int id;
	
	private String firstname;
	
	private List<Customer> customers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return firstname;
	}

	public void setName(String name) {
		this.firstname = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
