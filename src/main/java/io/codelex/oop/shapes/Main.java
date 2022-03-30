package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 3);
        Rectangle rectangle = new Rectangle(10, 5);
        Hexagon hexagon = new Hexagon(4, 7);
        Cone cone = new Cone(4, 4);
        Qube cube = new Qube(4);

        System.out.printf("Triangle sides: %d; Triangle perimeter: %.2f; Triangle area: %.2f\n",
                triangle.getNumSides(), triangle.getPerimeter(), triangle.getArea());

        System.out.printf("Rectangle sides: %d; Rectangle perimeter: %.2f; Rectangle area: %.2f\n",
                rectangle.getNumSides(), rectangle.getPerimeter(), rectangle.getArea());

        System.out.printf("Hexagon sides: %d; Hexagon perimeter: %.2f; Hexagon area: %.2f\n",
                hexagon.getNumSides(), hexagon.getPerimeter(), hexagon.getArea());

        System.out.printf("Cone sides: %d; Cone perimeter: %.2f; Cone area: %.2f; Cone volume: %.2f\n",
                cone.getNumSides(), cone.getPerimeter(), cone.getArea(), cone.calculateVolume());

        System.out.printf("Cube sides: %d; Cube perimeter: %.2f; Cube area: %.2f; Cube volume: %.2f\n",
                cube.getNumSides(), cube.getPerimeter(), cube.getArea(), cube.calculateVolume());
    }
}
