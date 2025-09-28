package entities;

public class Customer {
	private Integer id;
	private String name;
	private String email;
	
	public Customer() {}

	public Customer(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return String.format("Id - %d%nName: %s%nEmail: %s%n", id, name, email);
	}
}
