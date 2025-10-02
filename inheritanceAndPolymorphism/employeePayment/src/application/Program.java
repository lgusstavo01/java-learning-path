package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Employee> listEmployee = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter how many employees will be entered: ");

			if (!input.hasNextInt()) {
				System.out.print("Invalid data! Please enter an integer data type!");
			}

			int quantitityEmployees = input.nextInt();
			input.nextLine();

			for (int i = 0; i < quantitityEmployees; i++) {
				System.out.print("Outsourced (y/n): ");
				char option = readYesOrNo(input);

				if (option == 'y') {

					System.out.printf("%nEmployee #" + (i + 1) + " data:%n");
					System.out.print("Enter the employee's name: ");
					String name = input.nextLine();
					System.out.print("Report the number of hours worked: ");
					int hours = input.nextInt();
					System.out.print("Enter the hourly rate: ");
					double valuePerHour = input.nextDouble();
					System.out.print("Enter the additional value: ");
					double additionalValue = input.nextDouble();
					input.nextLine();

					listEmployee.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalValue));
					System.out.println();

				} else {

					System.out.printf("%nEmployee #" + (i + 1) + " data:%n");
					System.out.print("Enter the employee's name: ");
					String name = input.nextLine();
					System.out.print("Report the number of hours worked: ");
					int hours = input.nextInt();
					System.out.print("Enter the hourly rate: ");
					double valuePerHour = input.nextDouble();
					input.nextLine();

					listEmployee.add(new Employee(name, hours, valuePerHour));
					System.out.println();
				}
			}

			System.out.println("PAYMENTS:");
			for (Employee emp : listEmployee) {
				System.out.println(emp.toString());
			}
		}

	}

	private static char readYesOrNo(Scanner sc) {
		char option = sc.nextLine().toLowerCase().charAt(0);
		while (option != 'y' && option != 'n') {
			System.out.print("Invalid option! Enter y or n: ");
			option = sc.nextLine().toLowerCase().charAt(0);
		}
		return option;
	}

}
