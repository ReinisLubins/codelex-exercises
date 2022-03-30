package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {
    private String nameOfItem;
    private BigDecimal priceOfItem;

    public AbstractItem(String nameOfItem, double priceOfItem) {
        this.nameOfItem = nameOfItem;
        this.priceOfItem = BigDecimal.valueOf(priceOfItem);
    }

    public String name() {
        return nameOfItem;
    }

    public BigDecimal price() {
        return priceOfItem;
    }

    public String fullInfo() {
        return nameOfItem + ": " + priceOfItem;
    }
}
