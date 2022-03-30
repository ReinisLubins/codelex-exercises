package io.codelex.oop.summary.OrdersAndInvoices;

public class ElectronicsItem extends AbstractItem {
    private double powerInWatts;

    public ElectronicsItem(String nameOfItem, double priceOfItem, double powerInWatts) {
        super(nameOfItem, priceOfItem);
        this.powerInWatts = powerInWatts;
    }

    @Override
    public String fullInfo() {
        return name() + ", " + price() + "EUR, power: " + powerInWatts + "W";
    }
}
