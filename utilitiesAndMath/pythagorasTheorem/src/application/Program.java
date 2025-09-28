package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {
			startProgram(input);
		}
	}

	public static void startProgram(Scanner input) {
		double base = 0.0, height = 0.0;

		System.out.printf("Enter the value of base: ");

		base = readDouble(input);
		
		System.out.printf("Enter the value of height: ");
		
		height = readDouble(input);

		double valueHipotenuse = calculateHypotenuse(base, height);

		System.out.printf("%.2f%n", valueHipotenuse);
	}
	
	public static double readDouble(Scanner input) {
		double number = 0.0;
		while(true) {
			if(input.hasNextDouble()) {
				number = input.nextDouble();
				break;
			} else {
				System.out.printf("Enter a decimal value!%n%n");
				input.next();
			}
		}
		return number;
	}

	public static double calculateHypotenuse(double base, double height) {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}

}
