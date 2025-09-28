package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Constants
        final double COMMISSION_RATE = 0.05;

        try (Scanner input = new Scanner(System.in)) {
            String salespersonName;
            int salesCount;
            double totalSold;

            while (true) {
                System.out.print("Enter salesperson name: ");
                String candidate = input.nextLine().trim();

                if (!candidate.matches("[\\p{L} ]+")) {
                    System.out.println("Invalid name. Please enter only letters and spaces.\n");
                    continue;
                }
                salespersonName = candidate.replaceAll("\\s{2,}", " ");
                break;
            }

            while (true) {
                System.out.print("Enter total number of sales: ");
                if (!input.hasNextInt()) {
                    System.out.println("Invalid input! Please enter an integer value.\n");
                    input.next();
                    continue;
                }
                salesCount = input.nextInt();
                input.nextLine(); 

                if (salesCount <= 0) {
                    System.out.println("Invalid value! Total sales must be greater than 0.\n");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter the total amount sold: ");
                if (!input.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a numeric value (e.g. 1234.56).\n");
                    input.next();
                    continue;
                }
                totalSold = input.nextDouble();
                input.nextLine(); 

                if (totalSold <= 0.0) {
                    System.out.println("Invalid value! Amount must be greater than 0.\n");
                    continue;
                }
                break;
            }

            // Processing
            double commission = totalSold * COMMISSION_RATE;

            // Output
            System.out.println("\n===== DAILY SALES REPORT =====");
            System.out.printf("Salesperson: %s%n", salespersonName);
            System.out.printf("Total Sales: %d%n", salesCount);
            System.out.printf("Amount Sold: $%,.2f%n", totalSold);
            System.out.printf("Commission (5%%): $%,.2f%n", commission);
            System.out.println("==============================");
        }
    }
}
