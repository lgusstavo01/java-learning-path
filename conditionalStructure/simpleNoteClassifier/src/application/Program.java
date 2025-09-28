package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	// Constants -> Limit Grade
	private static final double LIMIT_MIN = 0.0; // Minimum value accepted as a grade
	private static final double LIMIT_MAX = 10.0; // Maximum value accepted as a grade	

	// Constants -> Excellent
	private static final double EXCELLENT_MIN = 9.0;
	private static final double EXCELLENT_MAX = 10.0;

	// Constants -> Good
	private static final double GOOD_MIN = 7.0;
	private static final double GOOD_MAX = 8.9;

	// Constants -> Fair
	private static final double FAIR_MIN = 5.0;
	private static final double FAIR_MAX = 6.9;

	// Constants -> Reproved
	private static final double REPROVED_MIN = 0.0;
	private static final double REPROVED_MAX = 4.9;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Input
			double grade = readValidGrade(input);

			// Processing
			String gradeStatusText  = gradeStatus(grade);
			
			//Output
			printGradeStatus(gradeStatusText );
		}

	}
	
	private static double readValidGrade(Scanner input) {
		while (true) {
			// Input	
			System.out.print("Enter the grade: ");
			
			if (input.hasNextDouble()) {	
				
				double gradeStudent = input.nextDouble();
				input.nextLine();

				if (validateGrade(gradeStudent)) {
					return gradeStudent;
				} else {
					System.out.printf("Invalid grade! Please enter a value between %.1f and %.1f.%n%n", LIMIT_MIN,
							LIMIT_MAX);
				}
			} else {
				System.out.printf("Invalid input! Please enter a numeric value.%n%n");
				input.nextLine();
			}
		}
	}

	private static boolean validateGrade(double grade) {
		return grade >= LIMIT_MIN && grade <= LIMIT_MAX;
	}

	private static String gradeStatus(double grade) {
		if (grade >= EXCELLENT_MIN && grade <= EXCELLENT_MAX) {
			return "Excellent!";
		} else if (grade >= GOOD_MIN && grade <= GOOD_MAX) {
			return "Good!";
		} else if (grade >= FAIR_MIN && grade <= FAIR_MAX) {
			return "Fair!";
		} else if (grade >= REPROVED_MIN && grade <= REPROVED_MAX) {
			return "Fail!";
		} else {
			return "Invalid Grade!";
		}
	}

	private static void printGradeStatus(String gradeStatus) {
		System.out.printf("%s%n", gradeStatus);
	}
}
