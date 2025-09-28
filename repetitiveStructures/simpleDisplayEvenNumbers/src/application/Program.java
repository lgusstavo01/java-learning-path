package application;

import java.util.Scanner;

public class Program {

	// CONSTANTS EXERCICE 1
	private final static int NUMBER_INIT = 2;
	private final static int NUMBER_LIMIT = 20;

	// CONSTANTS EXERCICE 2
	private final static int MAX_SIZE = 10;
	private final static int SCORE[] = new int[MAX_SIZE];

	// CONSTANTS EXERCICE 3
	private static int NUMBER_FACTORIAL = 0;

	private static final int CORRECT_PASSWORD = 1234;

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			validatePassword(input);
		}
	}

	public static void validatePassword(Scanner input) {
		final int MAX_ATTEMPTS = 3;
		int remaining = MAX_ATTEMPTS;

		while (remaining > 0) {
			int entered = readPassword(input);
			if (entered == CORRECT_PASSWORD) {
				System.out.println("Access granted.");
				return; // early exit on success
			}
			remaining--;
			if (remaining > 0) {
				System.out.printf("Access denied. Attempts remaining: %d%n", remaining);
			}
		}
		System.out.println("Access denied.");
	}

	public static int readPassword(Scanner input) {
		System.out.print("Enter password: ");
		while (!input.hasNextInt()) {
			System.out.println("Invalid input! Please enter an integer value.");
			input.next(); // consume invalid token to avoid infinite loop
			System.out.print("Enter password: ");
		}
		return input.nextInt();
	}

	// INIT HELPERS METHODS EXERCICE 3
	public static void readNumberFactorial(Scanner input) {
		System.out.printf("Enter integer value: %n");

		if (input.hasNextInt()) {
			NUMBER_FACTORIAL = input.nextInt();
		} else {
			System.out.printf("Invalid input! Please enter an integer value.%n%n");
		}
	}

	public static int calculateFactorial(Scanner input) {
		readNumberFactorial(input);

		if (NUMBER_FACTORIAL < 0) {
			System.out.println("Factorial is not defined for negative numbers!");
			return -1;
		}

		int factorial = 1;
		for (int i = NUMBER_FACTORIAL; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static void printFactorialNumber(Scanner input) {
		int result = calculateFactorial(input);

		System.out.printf("%d%n", result);
	}

	// END HELPERS METHODS EXERCICE 3

	// INIT HELPERS METHODS EXERCICE 2

	public static void printLargestNumber(Scanner input) {
		System.out.printf("Enter 10 integer values: %n");

		int aux = 0;
		while (aux < SCORE.length) {
			readNumbers(input, aux);
			aux++;
		}

		int largestNumber = returnLargestNumber();

		System.out.printf("Largest Number: %d%n", largestNumber);

	}

	public static void readNumbers(Scanner input, int position) {
		if (input.hasNextInt()) {
			SCORE[position] = input.nextInt();
		} else {
			System.out.printf("Invalid input! Please enter an integer value.%n%n");
		}
	}

	public static int returnLargestNumber() {
		// Step 1: assume the first element is the largest
		int largest = SCORE[0];

		// Step 2: loop through the array
		for (int i = 1; i < SCORE.length; i++) {
			// Step 3: if we find a bigger number, update "largest"
			if (SCORE[i] > largest) {
				largest = SCORE[i];
			}
		}

		// Step 4: return the largest number found
		return largest;
	}

	// END HELPERS METHODS EXERCICE 2

	// INIT HELPERS METHODS EXERCICE 1

	public static void printEvenNumbers() {
		int number = NUMBER_INIT;
		while (number <= NUMBER_LIMIT) {
			System.out.printf("%d%n", number);
			number += +2;
		}
	}

	// END HELPERS METHODS EXERCICE 1
}
