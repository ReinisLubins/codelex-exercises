package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double totalPay = super.pay() + (totalSales * commissionRate); // hours of work is set to 0 from Hourly parent class
        totalSales = 0;
        return totalPay;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent sales: " + totalSales;
        return result;
    }
}
