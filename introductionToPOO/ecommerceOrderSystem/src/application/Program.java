package application;

import java.util.Locale;

import entities.Customer;
import entities.Order;
import entities.Product;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // === Customers ===
        Customer c1 = new Customer(1, "Luiz Gustavo", "luiz@example.com");
        Customer c2 = new Customer(2, "Carlos Eduardo", "carlos@example.com");

        // === Products ===
        Product p1 = new Product(101, "iPhone 15", 7200.00);
        Product p2 = new Product(102, "MacBook Pro", 14500.00);
        Product p3 = new Product(103, "AirPods Pro", 1800.00);
        Product p4 = new Product(104, "iPad Air", 5200.00);
        Product p5 = new Product(105, "Apple Watch", 3500.00);

        // === Orders ===
        Order o1 = new Order(1001, c1);
        Order o2 = new Order(1002, c2);

        // Add products to order 1
        o1.addProduct(p1);
        o1.addProduct(p3);
        o1.addProduct(p5);

        // Add products to order 2
        o2.addProduct(p2);
        o2.addProduct(p4);
        o2.addProduct(p5);

        // Remove a product from order 2
        o2.removeProduct(105); // remove Apple Watch

        // === Print orders ===
        System.out.println(o1);
        System.out.println(o2);
    }
}
