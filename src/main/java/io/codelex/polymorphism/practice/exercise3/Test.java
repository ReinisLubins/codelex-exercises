package io.codelex.polymorphism.practice.exercise3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Reinis", "Lubins", "Home Street 2", 34653615, 99.99);
        Employee employee = new Employee("Andz", "Tupelnieks", "Dubai 32", 21325151, "Millionaire");

        student.display();
        employee.display();
    }
}
