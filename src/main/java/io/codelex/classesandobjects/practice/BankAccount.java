package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + ", " + printBalance();
    }

    public String printBalance() {
        DecimalFormat df = new DecimalFormat("0.00");
        if (balance < 0) {
            return "-$" + df.format(Math.abs(balance));
        } else {
            return "$" + df.format(balance);
        }
    }

    public static void main(String[] args) {
        BankAccount benson = new BankAccount("Benson", -17.25);
        System.out.println(benson);
    }
}
