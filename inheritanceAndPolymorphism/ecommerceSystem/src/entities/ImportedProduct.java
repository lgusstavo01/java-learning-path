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

	@Override
	public String toString() {
		return getName() + String.format(" - R$ %.2f", getPrice() + customsFee)
				+ String.format(" (Customs fee: R$ %.2f)", customsFee);
	}

}
