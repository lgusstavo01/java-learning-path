package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// Constants
		final int CM_PER_METER = 100;
		final int MM_PER_METER = 1_000;
		final double KM_PER_METER = 1_000.0;
		
		try(Scanner input = new Scanner(System.in)) {
			int distanceInMeters = 0;
			
			// Input
			while (true) {
			    System.out.print("Enter the total distance traveled in meters (e.g. 1850): ");
	
			    if (!input.hasNextInt()) {
			        System.out.println("Invalid input. Enter an integer value.");
			        System.out.println();
			        input.next();
			        continue;
			    }
	
			    distanceInMeters = input.nextInt();
	
			    if (distanceInMeters <= 0) {
			        System.out.println("Invalid value! Please enter a number greater than 0.");
			        System.out.println();
			        continue;
			    }
	
			    break;
			}
		
			// Processing
			long distanceInCentimeters = (long) distanceInMeters * CM_PER_METER;
			long distanceInMillimeters = (long) distanceInMeters * MM_PER_METER;
			double distanceInKilometers = distanceInMeters / KM_PER_METER;
			
			// Output
			System.out.printf("%n%d meters is equal to:%n%n", distanceInMeters);
			
			System.out.printf("%,d centimeters%n", distanceInCentimeters);
			System.out.printf("%,d millimeters%n", distanceInMillimeters);
			System.out.printf("%.2f kilometers%n%n", distanceInKilometers);
			
		} 
	}

}
