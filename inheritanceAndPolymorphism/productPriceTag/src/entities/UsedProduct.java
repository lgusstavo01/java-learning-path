package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufacturedDate;

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	private String priceTag() {
		return "Name: " + getName() + " (used) \n" + String.format("Price: %.2f%n", getPrice()) + "Manufacture date: "
				+ manufacturedDate.format(formatter);
	}

	@Override
	public String toString() {
		return priceTag();
	}

}
