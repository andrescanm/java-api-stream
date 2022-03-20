package co.models;

public class User {

	private String name;
	private String lastName;
	private Integer id;
	private static int countId;

	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return name + " " + lastName + " - id:" + id;
	}

}
