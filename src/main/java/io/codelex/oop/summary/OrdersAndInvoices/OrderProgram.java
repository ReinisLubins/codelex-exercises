package io.codelex.oop.summary.OrdersAndInvoices;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2022, 4, 1));
        ElectronicsItem radio = new ElectronicsItem("Radio", 25, 100);
        HouseHoldItem bucket = new HouseHoldItem("Bucket", 5, "red");

        Order order = new Order();
        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);

        Invoice invoice = new Invoice(order, "INV123");
        invoice.displayInvoice();
    }
}
