package entities;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	private String priceTag() {
		return "Name: "
				+ name
				+ String.format("%nPrice: R$%.2f%n", price);
	}

	@Override
	public String toString() {
		return priceTag();
	};
	
	
}
