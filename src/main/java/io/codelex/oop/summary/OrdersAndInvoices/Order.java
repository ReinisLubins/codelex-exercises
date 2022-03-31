package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThing> listOfItems;

    public Order() {
        this.listOfItems = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        listOfItems.add(item);
    }

    public BigDecimal sumOfItems() {
        return listOfItems.stream().map(SellableThing::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal vatValue() {
        return sumOfItems().multiply(BigDecimal.valueOf(0.21));
    }

    public BigDecimal totalValue() {
        return sumOfItems().add(vatValue());
    }

    public String[] displayOrder() {
        String[] itemsList = new String[listOfItems.size()];
        for (int i = 0; i < listOfItems.size(); i++) {
            itemsList[i] = listOfItems.get(i).fullInfo();
        }
        return itemsList;
    }
}
