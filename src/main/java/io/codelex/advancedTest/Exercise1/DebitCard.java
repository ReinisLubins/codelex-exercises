package io.codelex.advancedTest.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String owner, String number, int ccvCode, double balance) {
        super(owner, number, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        setBalance(getBalance().add(BigDecimal.valueOf(amount)));
        if (getBalance().compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        try {
            setBalance(getBalance().subtract(BigDecimal.valueOf(amount)));
            if (getBalance().compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
