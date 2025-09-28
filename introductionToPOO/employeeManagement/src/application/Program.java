package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Developer;
import entities.Employee;
import entities.Intern;
import entities.Manager;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();

		list.add(new Manager("Luiz Gustavo", 4000.00));
		list.add(new Developer("Carlos Eduardo", 2000.00));
		list.add(new Intern("Paçoca Amendoim", 1000.00));
		
		for(Employee x : list) {
			System.out.println(x);
		}
	}

}
