package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter birthFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("----- Insert data of client -----");
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Birthdate (dd/MM/yyyy): ");
            LocalDate birthDate = LocalDate.parse(input.nextLine(), birthFormatter);

            Client client = new Client(name, email, birthDate);

            System.out.println();
            System.out.println("----- Insert status of order -----");
            System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
            OrderStatus orderStatus = OrderStatus.valueOf(input.nextLine().toUpperCase());

            // Cria o pedido corretamente
            LocalDateTime moment = LocalDateTime.now();
            Order order = new Order(moment, orderStatus, client);

            System.out.println();
            System.out.println("----- Quantity of items in the order -----");
            System.out.print("Insert quantity of items: ");
            int quantity = input.nextInt();

            for (int i = 1; i <= quantity; i++) {
                System.out.println();
                System.out.println("----- Insert data of product #" + i + " -----");
                input.nextLine(); // consumir quebra de linha

                System.out.print("Name: ");
                String nameProduct = input.nextLine();

                System.out.print("Price: ");
                double price = input.nextDouble();

                System.out.print("Quantity: ");
                int quantityProduct = input.nextInt();

                Product product = new Product(nameProduct, price);
                OrderItem oi = new OrderItem(quantityProduct, price, product);

                order.addItem(oi);
            }

            System.out.println();
            System.out.println(order);
        }
    }
}
