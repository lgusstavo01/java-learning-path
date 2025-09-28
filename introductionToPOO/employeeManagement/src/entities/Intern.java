package entities;

public class Intern extends Employee {

	public Intern() {
	}

	public Intern(String name, Double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return 500.0;
	}

	@Override
	public String getRole() {
		return "Intern";
	}

}
