package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Client;
import entities.ImportedProduct;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.UsedProduct;
import util.Status;

public class Program {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);

        // Creating client
        Client client = new Client("Alex Green", "alex@gmail.com");

        // Creating products
        Product p1 = new Product("Laptop", 3000.0);
        Product p2 = new UsedProduct("iPhone 12", 1800.0, LocalDate.of(2021, 5, 20));
        Product p3 = new ImportedProduct("Camera", 2500.0, 300.0);

        // Creating order items
        List<OrderItem> items = new ArrayList<>();
        items.add(new OrderItem(1, p1));
        items.add(new OrderItem(2, p2));
        items.add(new OrderItem(1, p3));

        // Creating the order
        Order order = new Order(LocalDate.now(), Status.PROCESSANDO, client, items);

        // Printing summary
        System.out.println(order);
    }
}
