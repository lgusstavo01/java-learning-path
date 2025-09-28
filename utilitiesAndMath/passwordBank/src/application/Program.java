package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

			while (true) {
				System.out.print("Enter the password: ");
				String password = readPassword(input);
				if (validatePassword(password)) {
					System.out.printf("Valid password.%n%n");
					break;
				} else {
					System.out.printf(errorMessage());
					input.nextLine();
				}
			}
		}
	}

	public static String readPassword(Scanner input) {
		String password = input.nextLine().trim().replace(" ", "");
		return password;
	}

	public static boolean validatePassword(String password) {
		return password.length() >= 6 ? true : false;
	}
	
	public static String errorMessage() {
		return "Invalid password. Password must be at least 6 characters long.%n%n";
	}
}
