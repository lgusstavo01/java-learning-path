package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;

public class Order {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(moment.format(formatter)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
