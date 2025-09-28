package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)){
			String nameUppercase = readName(input);
			String nameLowercase = toLowerCaseName(nameUppercase);
			System.out.printf("%s%n%n", nameLowercase);
		}

	}
	
	public static String readName(Scanner input) {
		String name;
		
		while (true) {
		    System.out.print("Enter the name: ");
		    String inputName = input.nextLine();

		    if (inputName.matches("[A-Za-z ]+")) {
		        name = inputName.toUpperCase();
		        break;
		    } else {
		        System.out.println("Enter only alphabetic characters, please!");
		    }
		}
		return name;
	}
	
	public static String toLowerCaseName(String name) {
		return name.toLowerCase();
	}

}
