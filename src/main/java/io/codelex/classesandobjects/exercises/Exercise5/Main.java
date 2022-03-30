package io.codelex.classesandobjects.exercises.Exercise5;

public class Main {
    public static void main(String[] args) {
        Date newDate = new Date(12, 5, 1996);
        newDate.displayDate();
        newDate.setDay(14);
        newDate.setMonth(2);
        newDate.setYear(2022);
        System.out.println(newDate.getDay());
        newDate.displayDate();
    }
}
