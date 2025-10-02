package entities;

public class Client {
	private String name;
	private String email;

	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Client name: " + name + "\nClient e-mail: " + email;
	}

}
