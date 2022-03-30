package io.codelex.oop.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape {
    private BigDecimal width;
    private BigDecimal height;
    private final RoundingMode roundingMode = RoundingMode.FLOOR;

    public Hexagon(int width, int height) {
        super(6);
        this.width = BigDecimal.valueOf(width);
        this.height = BigDecimal.valueOf(height);
    }

    @Override
    public BigDecimal getArea() {
        return (getPerimeter().multiply(height.divide(BigDecimal.valueOf(2), roundingMode))).divide(BigDecimal.valueOf(2), roundingMode);
    }

    @Override
    public BigDecimal getPerimeter() {
        return (height.divide(BigDecimal.valueOf(2), roundingMode)).multiply(BigDecimal.valueOf(getNumSides()));
    }
}
