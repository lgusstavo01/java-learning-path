package entities;

public class Manager extends Employee {
	
	public Manager() {
	}

	public Manager(String name, Double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return getSalary() * 0.20;
	}
	
	@Override
	public String getRole() {
		return "Manager";
	}
}
