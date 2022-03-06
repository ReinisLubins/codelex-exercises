package io.codelex.classesandobjects.exercises.Exercise9;

public class Main {
    public static void main(String[] args) {
        Points p1 = new Points(3, 5);
        Points p2 = new Points(10, -4);

        System.out.println(p1 + " - Point nr1");
        System.out.println(p2 + " - Point nr2");

        Points.swapPoints(p1, p2);

        System.out.println(p1 + " - Point nr1");
        System.out.println(p2 + " - Point nr2");
    }
}
