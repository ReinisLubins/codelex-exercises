package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate startedProgramming = LocalDate.of(2020, 2, 22);
        Employee employee = new Employee("Reinis", "Lubins", "09145", 25, "Programmer", startedProgramming);
        Customer customer = new Customer("Andz", "Bikers", "0515", 31, 20);

        System.out.println(employee.getInfo());
        System.out.println(customer.getInfo());
    }
}
