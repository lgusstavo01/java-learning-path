package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String name;
	private String email;
	private LocalDate birthDate;

	public Client() {}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Client name: "
				+ name
				+ "\nClient email: "
				+ email
				+ "\nClient birthdate: "
				+ birthDate.format(formatter)
				+ "\n";
	}
	
	
	
}