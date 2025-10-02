package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Shape> listShapes = new ArrayList<>();
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the number of shapes to be calculated: ");
			
			if (!sc.hasNextInt()){
				System.out.println("Invalid data! Please enter an integer value.");
			}
			
			int quantityShapes = sc.nextInt();
			
			for(int i = 0; i < quantityShapes; i++) {
				sc.nextLine();
				System.out.print("Do you want to calculate the area of ​​circle or rectangle (c/r)? ");
				char option = readShape(sc);
				
				if(option == 'c') {
					System.out.print("Enter the radius of the circle: ");
					double radius = sc.nextDouble();
					
					listShapes.add(new Circle(radius));
				} else {
					System.out.print("Enter the height of the rectangle: ");
					double height = sc.nextDouble();
					System.out.print("Enter the length of the rectangle: ");
					double length = sc.nextDouble();
					
					listShapes.add(new Rectangle(length, height));
				}
			}
			
			System.out.println();
			for(Shape shape : listShapes) {
				System.out.println(shape.toString());
			}
		}
		
	}
	
	private static char readShape(Scanner sc) {
		char option = sc.nextLine().toLowerCase().charAt(0);
		while (option != 'c' && option != 'r') {
			System.out.print("Invalid option! Enter c or r: ");
			option = sc.nextLine().toLowerCase().charAt(0);
		}
		return option;
	}


}
