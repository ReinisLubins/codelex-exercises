package io.codelex.oop.summary.OrdersAndInvoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate dateOfExpiration;

    public FoodItem(String nameOfItem, double priceOfItem, LocalDate dateOfExpiration) throws BadFoodException {
        super(nameOfItem, priceOfItem);
        this.dateOfExpiration = dateOfExpiration;
        if (dateOfExpiration.isBefore(LocalDate.now())) {
            throw new BadFoodException("Food is bad!");
        }
    }

    @Override
    public String fullInfo() {
        return name() + ", " + price() + "EUR, best before: " + dateOfExpiration;
    }
}
