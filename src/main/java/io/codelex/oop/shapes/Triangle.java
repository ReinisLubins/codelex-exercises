package io.codelex.oop.shapes;

import java.math.BigDecimal;

public class Triangle extends Shape {
    private BigDecimal width;
    private BigDecimal height;

    public Triangle(int width, int height) {
        super(3);
        this.width = BigDecimal.valueOf(width);
        this.height = BigDecimal.valueOf(height);
    }

    @Override
    public BigDecimal getArea() {

        BigDecimal base = width.divide(BigDecimal.valueOf(2));
        return ((base.multiply(height)).divide(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(2)));
    }

    @Override
    public BigDecimal getPerimeter() {
        return width.multiply(BigDecimal.valueOf(3));
    }
}
