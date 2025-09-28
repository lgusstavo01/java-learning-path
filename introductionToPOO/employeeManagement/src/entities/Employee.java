package entities;

public abstract class Employee {
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public abstract double calculateBonus();

	public abstract String getRole();

	@Override
	public String toString() {
		return String.format("Name: %s%nSalary: %.2f%nRole: %s%nBonus: %.2f%n", name, salary, getRole(),
				calculateBonus());
	}
}
