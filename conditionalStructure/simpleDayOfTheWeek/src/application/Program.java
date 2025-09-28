package application;

import java.util.Scanner;

public class Program {

	// Constants
	private static final String[] DAYS_OF_WEEK = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
			"Sunday" };
	private static final int AGE_MIN = 13;
	private static final int DAY_MAX = 7;
	private static final int DAY_MIN = 1;

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			// Input + Check Age
			readValidAge(input);

			// Processing + Output
			System.out.println(daySelected(input));

		}
	}

	private static int readValidAge(Scanner input) {
		while (true) {
			System.out.printf("Enter your age: ");

			if (input.hasNextInt()) {
				int age = input.nextInt();
				input.nextLine();

				if (validAge(age)) {
					return age;
				} else {
					System.out.printf("Access denied!%n");
					System.exit(0);
				}
			} else {
				System.out.printf("Invalid input! Please enter an integer value.%n%n");
				input.nextLine();
			}
		}
	}

	private static boolean validAge(int age) {
		return (age >= AGE_MIN) ? true : false;
	}

	private static void printMenu() {
		for (int i = 0; i < DAYS_OF_WEEK.length; i++) {
			System.out.printf("%d - %s%n", (i + 1), DAYS_OF_WEEK[i]);
		}
	}

	private static String daySelected(Scanner input) {
		System.out.printf("Selecione um dia: %n");

		printMenu();

		while (true) {
			if (input.hasNextInt()) {

				int daySelected = input.nextInt();
				input.nextLine();

				if (daySelected <= DAY_MAX && daySelected >= DAY_MIN) {
					return "The selected day was: " + DAYS_OF_WEEK[daySelected];
				} else {
					System.out.printf("Invalid day! Please, select day between 1 and 7: ");
				}
			} else {
				System.out.printf("Invalid input! Please enter an integer value: ");
				input.nextLine();
			}
		}
	}
}
