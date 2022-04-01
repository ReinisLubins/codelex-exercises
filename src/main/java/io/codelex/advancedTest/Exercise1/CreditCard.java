package io.codelex.advancedTest.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String owner, String number, int ccvCode, double balance) {
        super(owner, number, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        setBalance(getBalance().add(BigDecimal.valueOf(amount)));
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        try {
            setBalance(getBalance().subtract(BigDecimal.valueOf(amount)));
            if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
                System.out.println("Warning: Low funds");
            }
        } catch (ArithmeticException e) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
