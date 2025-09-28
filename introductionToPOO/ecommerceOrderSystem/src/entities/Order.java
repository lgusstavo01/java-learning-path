package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer id;
	private Customer customer;
	private List<Product> listProducts = new ArrayList<>();

	public Order() {
	}

	public Order(Integer id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Product> getListProducts() {
		return List.copyOf(listProducts);
	}

	public void addProduct(Product p) {
		listProducts.add(p);
	}

	public boolean removeProduct(int id) {
		return listProducts.removeIf(p -> p.getId() == id);
	}

	public double calculateTotal() {
		double total = 0.0;
		for (Product p : listProducts) {
			total += p.getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order ID: ").append(id).append("\n");
		sb.append("Customer: ").append(customer).append("\n");
		sb.append("Products:\n");
		for (Product p : listProducts) {
			sb.append("- ").append(p).append("\n");
		}
		sb.append(String.format("Total: %.2f\n", calculateTotal()));
		return sb.toString();
	}

}
