package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public interface SellableThing {
    public String name();

    public BigDecimal price();

    public String fullInfo();
}
