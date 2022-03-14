package io.codelex.oop.shapes;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    private BigDecimal width;
    private BigDecimal height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = BigDecimal.valueOf(width);
        this.height = BigDecimal.valueOf(height);
    }

    @Override
    public BigDecimal getArea() {
        return width.multiply(height);
    }

    @Override
    public BigDecimal getPerimeter() {
        return (width.multiply(BigDecimal.valueOf(2))).add(height.multiply(BigDecimal.valueOf(2)));
        //(width * 2) + (height * 2);
    }
}
