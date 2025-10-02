package entities;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	private Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	private String priceTag() {
		return "Name: "
				+ getName()
				+ String.format("%nPrice: R$ %.2f%n", totalPrice())
				+ String.format("Customs fee: R$ %.2f%n", customsFee);
	}

	@Override
	public String toString() {
		return "\n" + priceTag();
	}

	
}
