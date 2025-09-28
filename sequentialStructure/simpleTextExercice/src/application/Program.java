package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter your name: ");
		String userName = input.nextLine();
		
		System.out.print("Enter your age: ");
		int userAge = input.nextInt();
		
		// Output
		System.out.printf("Hello, %s! You are %d years old.%n", userName, userAge);
		
		input.close();
	}
}
