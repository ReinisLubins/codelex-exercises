package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 3);
        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Triangle sides: " + triangle.getNumSides() + "; Triangle perimeter: " + triangle.getPerimeter() + "; Triangle area: " + triangle.getArea());
        System.out.println("Rectangle sides: " + rectangle.getNumSides() + "; Rectangle perimeter: " + rectangle.getPerimeter() + "; Rectangle area: " + rectangle.getArea());
    }
}
