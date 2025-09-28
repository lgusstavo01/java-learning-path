package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	// Constants
	private static final int MIN_LIMIT_SALARY = 0;

	private static final int LIMIT_JUNIOR = 3000;

	private static final int MIN_LIMIT_PLENO = 3000;
	private static final int MAX_LIMIT_PLENO = 6000;

	private static final int LIMIT_SENIOR = 6000;

	private static final String[] EMPLOYEE_CATEGORIES = { "JUNIOR", "PLENO", "SENIOR" };

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Input
			double salaryEmployee = inputSalaryEmployee(input);
			String categoryEmployee = inputCategoryEmployee(input);

			// Processing + Output
			String result = classifySalary(salaryEmployee, categoryEmployee);
			System.out.printf("%s%n", result);
		}
	}

	private static boolean isPositive(double salaryEmployee) {
		return salaryEmployee > MIN_LIMIT_SALARY;
	}
	
    private static boolean isValidCategory(String cat) {
        for (String c : EMPLOYEE_CATEGORIES) {
            if (c.equals(cat)) return true;
        }
        return false;
    }

	private static double inputSalaryEmployee(Scanner input) {
		while (true) {
			 System.out.printf("Enter the employee salary: ");
			double salaryEmployee = 0.0;

			if (input.hasNextDouble()) {
				salaryEmployee = input.nextDouble();
				input.nextLine();

				if (!isPositive(salaryEmployee)) {
					System.out.printf("Invalid value! Please enter a positive number.%n%n");
					continue;
				}

				return salaryEmployee;
			} else {
				System.out.printf("Invalid input! Please enter a numeric value.%n%n");
				input.nextLine();
			}
		}
	}

	private static String inputCategoryEmployee(Scanner input) {
	    while (true) {
	        System.out.printf("Enter the employee category (Junior/Pleno/Senior): ");
	        String categoryEmployee = input.nextLine().trim().toUpperCase();

	        if (!isValidCategory(categoryEmployee)) {
	            System.out.printf("Invalid category! Please type Junior, Pleno or Senior.%n%n");
	            continue;
	        }

	        return categoryEmployee;
	    }
	}

	private static String classifySalary(double salaryEmployee, String categoryEmployee) {
		if (salaryEmployee < LIMIT_JUNIOR && categoryEmployee.equals(EMPLOYEE_CATEGORIES[0])) {
			return "Below average salary!";
		} else if (salaryEmployee >= MIN_LIMIT_PLENO && salaryEmployee <= MAX_LIMIT_PLENO
				&& categoryEmployee.equals(EMPLOYEE_CATEGORIES[1])) {
			return "Within average!";
		} else if (salaryEmployee > LIMIT_SENIOR && categoryEmployee.equals(EMPLOYEE_CATEGORIES[2])) {
			return "Above average!";
		} else {
			return "Inconsistent data!";
		}
	}
}
