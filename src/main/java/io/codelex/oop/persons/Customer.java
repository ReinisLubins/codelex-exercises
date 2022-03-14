package io.codelex.oop.persons;

public class Customer extends Persons {
    private int purchaseCount;

    public Customer(String firstName, String lastName, String customerId, int age, int purchaseCount) {
        super(firstName, lastName, customerId, age);
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getId() + " (" + getPurchaseCount() + " purchases).";
    }
}
