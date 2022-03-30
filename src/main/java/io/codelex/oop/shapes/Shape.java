package io.codelex.oop.shapes;

import java.math.BigDecimal;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract BigDecimal getArea();

    public abstract BigDecimal getPerimeter();
}
