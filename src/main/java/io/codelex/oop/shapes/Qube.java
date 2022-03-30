package io.codelex.oop.shapes;

import java.math.BigDecimal;

public class Qube extends ThreeDShape {
    private BigDecimal width;
    private final BigDecimal edges = BigDecimal.valueOf(12);

    public Qube(int width) {
        super(6);
        this.width = BigDecimal.valueOf(width);
    }

    @Override
    public BigDecimal getArea() {
        return width.pow(2).multiply(BigDecimal.valueOf(getNumSides()));
    }

    @Override
    public BigDecimal getPerimeter() {
        return width.multiply(edges);
    }

    @Override
    public BigDecimal calculateVolume() {
        return width.pow(3);
    }
}
