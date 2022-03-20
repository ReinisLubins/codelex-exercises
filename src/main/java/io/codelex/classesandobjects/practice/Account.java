package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        to.deposit(howMuch);
        from.withdrawal(howMuch);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+ bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+ bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        System.out.println();

        //New Account

        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println("Matt's account balance is now: "+ mattsAccount.balance());
        System.out.println("My account balance is now: "+ myAccount.balance());
        System.out.println();

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        Account.transfer(a, b, 50);
        Account.transfer(b, c, 25);

        System.out.println("A account balance is now: "+ a.balance());
        System.out.println("B account balance is now: "+ b.balance());
        System.out.println("C account balance is now: "+ c.balance());
    }
}
