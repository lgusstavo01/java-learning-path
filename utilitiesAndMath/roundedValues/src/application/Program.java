package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)) {
			double number = readNumber(input);
			int roundedValue = roundNumber(number);
			System.out.printf("%d%n", roundedValue);
		}
	}

	public static double readNumber(Scanner input) {
		double numberDecimal = 0.0;
		while (true) {
			System.out.print("Enter a decimal number: ");
			
			if (input.hasNextDouble()) {
				numberDecimal = input.nextDouble();
				break;
			} else {
				System.out.printf("Invalid input. Please enter a valid decimal number.%n%n");
				input.nextLine();
			}
		}
		return numberDecimal;
	}

	public static int roundNumber(double number) {
		return (int) Math.round(number);
	}
}
