package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import util.Status;

public class Order {
	private LocalDate date;
	private Status status;
	private Client client;
	List<OrderItem> listOrder = new ArrayList<>();

	public Order(LocalDate date, Status status, Client client, List<OrderItem> listOrder) {
		this.date = date;
		this.status = status;
		this.client = client;
		this.listOrder = listOrder;
	}

	public LocalDate getDate() {
		return date;
	}

	public Status getStatus() {
		return status;
	}

	public Client getClient() {
		return client;
	}

	public Double totalValue() {
		double sum = 0.0;
		for (OrderItem p : listOrder) {
			sum += p.totalValue();
		}
		return sum;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("ORDER SUMMARY:\n");
	    sb.append("Order date: ").append(date).append("\n");
	    sb.append("Order status: ").append(status).append("\n");
	    sb.append(client).append("\n\n");
	    sb.append("Items:\n");
	    for (OrderItem o : listOrder) {
	        sb.append(o).append("\n");
	    }
	    sb.append(String.format("Total price: R$ %.2f", totalValue()));
	    return sb.toString();
	}


}
