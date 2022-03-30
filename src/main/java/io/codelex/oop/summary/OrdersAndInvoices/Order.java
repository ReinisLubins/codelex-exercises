package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<AbstractItem> listOfItems;

    public Order() {
        this.listOfItems = new ArrayList<>();
    }

    public void addItem(AbstractItem item) {
        listOfItems.add(item);
    }

    public BigDecimal sumOfItems() {
        return listOfItems.stream().map(AbstractItem::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal vatValue() {
        return sumOfItems().multiply(BigDecimal.valueOf(0.21));
    }

    public BigDecimal totalValue() {
        return sumOfItems().add(vatValue());
    }

    public void displayOrder() {
        for (int i = 0; i < listOfItems.size(); i++) {
            System.out.println("= " + i + "." + listOfItems.get(i).fullInfo());
        }
    }
}
