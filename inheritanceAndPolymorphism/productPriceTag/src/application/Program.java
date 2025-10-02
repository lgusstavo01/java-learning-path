package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);

		List<Product> listProduct = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of products: ");

			if (!input.hasNextInt()) {
				System.out.print("Invalid data! Please enter an integer data type!");
			}

			int quantityProducts = input.nextInt();
			input.nextLine();

			for (int i = 0; i < quantityProducts; i++) {
				System.out.printf("%nProduct #" + (i + 1) + " data:%n");
				System.out.printf("Commom, Used or Imported (c,u,i): ");
				char option = readDataProduct(input);

				if (option == 'c') {
					System.out.printf("Name: ");
					String name = input.nextLine();

					System.out.printf("Price: ");
					double priceProductCommom = input.nextDouble();
					input.nextLine();

					listProduct.add(new Product(name, priceProductCommom));
				} else if (option == 'u') {
					System.out.printf("Name: ");
					String name = input.nextLine();

					System.out.printf("Price: ");
					double priceProductUsed = input.nextDouble();
					input.nextLine();
					
					System.out.printf("Manufacture date (DD/MM/YYYY): ");
					String date = input.nextLine();
					LocalDate manufactureDate = LocalDate.parse(date, formatter);

					
					listProduct.add(new UsedProduct(name, priceProductUsed, manufactureDate));

				} else {
					System.out.printf("Name: ");
					String name = input.nextLine();

					System.out.printf("Price: ");
					double priceProductImported = input.nextDouble();
					
					System.out.printf("Customs fee: ");
					double customsFee = input.nextDouble();
					input.nextLine();
					
					listProduct.add(new ImportedProduct(name, priceProductImported, customsFee));
				}
			}
			
			System.out.printf("%n");
			for(Product p : listProduct) {
				System.out.println(p.toString());
			}
		}

	}

	private static char readDataProduct(Scanner sc) {
		char option = sc.nextLine().toLowerCase().charAt(0);
		while (option != 'c' && option != 'u' && option != 'i') {
			System.out.print("Invalid option! Enter c, u or i: ");
			option = sc.nextLine().toLowerCase().charAt(0);
		}
		return option;
	}

}
