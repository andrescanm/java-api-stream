package co.models;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String lastName;
	private Integer id;
	private static int countId;
	List<Invoice> invoices;

	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.invoices = new ArrayList<>();
		this.id = ++countId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void addInvoice(Invoice invoice) {
		this.invoices.add(invoice);
		invoice.setUser(this);
	}

	@Override
	public String toString() {
		return name + " " + lastName + " - id:" + id;
	}

}
