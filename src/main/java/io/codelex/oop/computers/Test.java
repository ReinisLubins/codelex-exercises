package io.codelex.oop.computers;

public class Test {
    public static void main(String[] args) {
        Computer no1 = new Computer("Intel Core I7", "DDR4", "Geforce Gtx", "Asus, ROG");
        Computer no2 = new Computer("Intel", "DDR6", "BadCard", "PH");

        no2.setProcessor("Intel First");
        System.out.println(no2.getProcessor());
        System.out.println(no1);

        if (no1.equals(no2)) {
            System.out.println("These computers are equal!");
        } else {
            System.out.println("These computers are not equal!");
        }

        Laptop first = new Laptop("Intel Core New", "DDR10", "Geforce One", "MSI, Good", "Great Battery with Good Capacity");
        Laptop second = new Laptop("Intel", "DDR6", "BadCard", "PH", "Bad Battery with Bad Capacity");

        first.setBatteryParameter("Very good Battery");
        System.out.println(first);

        if (first.equals(second)) {
            System.out.println("These laptops are equal!");
        } else {
            System.out.println("These laptops are not equal!");
        }
    }
}
