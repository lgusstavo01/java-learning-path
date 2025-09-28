package application;

import java.util.Scanner;

public class Program {

	// Constants
	private static final int LEGAL_AGE = 18;
	private static final int MIN_AGE = 1;
	private static final int MAX_AGE = 150;

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			// Input validation
			int age = readValidAge(input);

			// Processing
			String status = ageStatus(age);

			// Output
			System.out.println(status);
		}
	}

	private static int readValidAge(Scanner input) {
		while (true) {
			System.out.print("Enter your age: ");

			if (input.hasNextInt()) {
				int age = input.nextInt();
				input.nextLine();

				if (validateAge(age)) {
					return age;
				} else {
					System.out.printf("Invalid age! Please enter a value between %d and %d.%n%n", MIN_AGE, MAX_AGE);
				}
			} else {
				System.out.printf("Invalid input! Please enter an integer value.%n%n");
				input.nextLine();
			}
		}
	}

	// Pure validation method
	private static boolean validateAge(int age) {
		return age >= MIN_AGE && age <= MAX_AGE;
	}

	private static String ageStatus(int age) {
		return (age >= LEGAL_AGE) ? "Legal age!" : "Under age!";
	}

}