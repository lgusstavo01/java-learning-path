package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// Constants
		final double RATE_LOW = 0.20;
		final double RATE_MEDIUM = 0.25;
		final double RATE_HIGH = 0.30;

		final double LIMIT_LOW = 100;
		final double LIMIT_MEDIUM = 200;

		try (Scanner input = new Scanner(System.in)) {
			String consumerName;
			double consumptionKwh = 0.0;
			double totalBill = 0.0;

			// Input
			while (true) {
				System.out.print("Enter consumer name: ");
				String inputName = input.nextLine().trim();

				// Name validation
				if (!inputName.matches("[\\p{L} ]+")) {
					System.out.println("Invalid name. Please enter only letters and spaces.");
					System.out.println();
					continue;
				}

				consumerName = inputName;

				System.out.print("Enter total energy consumption: ");

				// Value validation
				if (!input.hasNextDouble()) {
					System.out.print("Invalid value! Please enter only numbers and decimal places (e.g. 123.45)");
					System.out.println();
					input.next();
					continue;
				}

				consumptionKwh = input.nextDouble();
				input.nextLine();

				if (consumptionKwh <= 0) {
					System.out.println("Invalid value! Please enter a number greater than 0.");
					System.out.println();
					continue;
				}

				break;
			}

			// Processing
			if (consumptionKwh <= LIMIT_LOW) {
				totalBill = consumptionKwh * RATE_LOW;
			} else if (consumptionKwh >= LIMIT_LOW && consumptionKwh <= LIMIT_MEDIUM) {
				totalBill = consumptionKwh * RATE_MEDIUM;
			} else if (consumptionKwh > LIMIT_MEDIUM) {
				totalBill = consumptionKwh * RATE_HIGH;
			}

			// Output

			System.out.printf("%nCustomer: %s%n", consumerName);
			System.out.printf("Consumption: %.2f kWh%n", consumptionKwh);
			System.out.printf("Total Bill: $%.2f", totalBill);
		}
	}

}
