package io.codelex.advancedTest.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String owner, String number, int ccvCode, BigDecimal balance) {
        super(owner, number, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        setBalance(getBalance().add(BigDecimal.valueOf(amount)));
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        setBalance(getBalance().subtract(BigDecimal.valueOf(amount)));
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }

        if (getBalance().compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds!");
        }

    }
}
