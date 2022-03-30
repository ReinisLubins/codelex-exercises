package io.codelex.oop.summary.OrdersAndInvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate dateOfExpiration;

    public FoodItem(String nameOfItem, double priceOfItem, LocalDate dateOfExpiration) {
        super(nameOfItem, priceOfItem);
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String fullInfo() {
        return name() + ", " + price() + "EUR, best before: " + dateOfExpiration;
    }
}
