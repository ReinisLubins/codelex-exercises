package io.codelex.advancedTest.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String owner, String number, int ccvCode, BigDecimal balance) {
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
        setBalance(getBalance().subtract(BigDecimal.valueOf(amount)));
        if (getBalance().compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
