package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final int PRICE = 5;

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(PRICE);
    }

    @Override
    public String fullInfo() {
        return "Item packing, 5.00 EUR";
    }
}
