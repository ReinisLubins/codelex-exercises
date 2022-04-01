package io.codelex.advancedTest.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private String owner;
    private String number;
    private int ccvCode;
    private BigDecimal balance;

    public Card(String owner, String number, int ccvCode, double balance) {
        this.owner = owner;
        this.number = number;
        this.ccvCode = ccvCode;
        this.balance = BigDecimal.valueOf(balance);
    }

    public abstract void addMoney(double amount);

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

    public String getOwner() {
        return owner;
    }

    public String getNumber() {
        return number;
    }

    public int getCcvCode() {
        return ccvCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    protected void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
