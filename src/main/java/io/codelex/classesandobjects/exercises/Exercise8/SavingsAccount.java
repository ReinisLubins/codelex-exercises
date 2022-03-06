package io.codelex.classesandobjects.exercises.Exercise8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;
    private int monthsInBank;
    private double sumOfDepositMoney;
    private double sumOfWithdrawMoney;
    private double totalInterest;

    public SavingsAccount(double balance, double annualInterestRate, int monthsInBank) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.monthsInBank = monthsInBank;
    }

    Scanner in = new Scanner(System.in);

    public void deposit(double depositMoney) {
        if (depositMoney < 0) {
            System.out.println("Insufficient amount! Try again: ");
            double tryAgain = in.nextDouble();
            balance += tryAgain;
            sumOfDepositMoney += tryAgain;
        } else {
            balance += depositMoney;
            sumOfDepositMoney += depositMoney;
        }
    }

    public void withdraw(double withdrawMoney) {
        if (withdrawMoney > balance || withdrawMoney < 0) {
            System.out.println("Insufficient amount! Try again: ");
            double tryAgain = in.nextDouble();
            balance -= tryAgain;
            sumOfWithdrawMoney += tryAgain;
        } else {
            balance -= withdrawMoney;
            sumOfWithdrawMoney += withdrawMoney;
        }
    }

    public void monthlyInterestRate() {
        double monthlyInterestRate = (annualInterestRate / 12);
        totalInterest += (balance * monthlyInterestRate);
        balance += (balance * monthlyInterestRate);
    }

    public String getSumOfDepositMoney() {
        return formatNumber(sumOfDepositMoney);
    }

    public String getSumOfWithdrawMoney() {
        return formatNumber(sumOfWithdrawMoney);
    }

    public String getTotalInterest() {
        return formatNumber(this.totalInterest);
    }

    public String getBalance() {
        return formatNumber(balance);
    }

    public static String formatNumber(double value) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(value);
    }
}
