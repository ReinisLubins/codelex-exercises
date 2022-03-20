package io.codelex.classesandobjects.exercises.Exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money is in the bank account? ");
        double moneyInAccount = in.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = in.nextDouble();

        System.out.print("How long has the account been opened? ");
        int openedInBank = in.nextInt();
        System.out.println();

        SavingsAccount customer = new SavingsAccount(moneyInAccount, annualInterestRate, openedInBank);

        for (int i = 0; i < openedInBank; i++) {
            System.out.print("Enter amount to deposited for month: " + (i + 1) + ": ");
            double depositMoney = in.nextDouble();
            customer.deposit(depositMoney);

            System.out.print("Enter amount to withdraw for: " + (i + 1) + ": ");
            double withdrawMoney = in.nextDouble();
            customer.withdraw(withdrawMoney);
            customer.monthlyInterestRate();
            System.out.println();
        }
        System.out.println("Total deposited: $" + customer.getSumOfDepositMoney());
        System.out.println("Total withdraw: $" + customer.getSumOfWithdrawMoney());
        System.out.println("Interest earned: $" + customer.getTotalInterest());
        System.out.println("Ending balance: $" + customer.getBalance());
    }
}
