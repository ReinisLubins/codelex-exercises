package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public interface Item {
    public String name();

    public BigDecimal price();

    public String fullInfo();
}
