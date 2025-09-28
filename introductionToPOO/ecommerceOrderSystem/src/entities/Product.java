package entities;

public class Product {
	private Integer id;
	private String name;
	private Double price;

	public Product() {
	}

	public Product(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Id: %d%nName: %s%nPrice: %.2f%n", id, name, price);
	}
}
