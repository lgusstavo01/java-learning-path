package entities;

public class Developer extends Employee {

	public Developer() {
	}

	public Developer(String name, Double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return getSalary() * 0.10;
	}

	@Override
	public String getRole() {
		return "Developer";
	}

}
