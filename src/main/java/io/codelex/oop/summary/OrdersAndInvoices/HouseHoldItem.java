package io.codelex.oop.summary.OrdersAndInvoices;

public class HouseHoldItem extends AbstractItem {
    private String color;

    public HouseHoldItem(String nameOfItem, double priceOfItem, String color) {
        super(nameOfItem, priceOfItem);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return name() + ", " + price() + "EUR, color: " + color;
    }
}
