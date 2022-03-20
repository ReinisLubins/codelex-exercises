package io.codelex.oop.shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Cone extends ThreeDShape {
    private BigDecimal width;
    private BigDecimal height;
    private final MathContext mc = new MathContext(3);
    private final RoundingMode roundingMode = RoundingMode.FLOOR;
    private final BigDecimal pi = BigDecimal.valueOf(Math.PI);

    public Cone(int width, int height) {
        super(2);
        this.width = BigDecimal.valueOf(width);
        this.height = BigDecimal.valueOf(height);
    }

    private BigDecimal radius() {
        return width.divide(BigDecimal.valueOf(2), roundingMode);
    }

    private BigDecimal sideOfCone() {
        return (radius().pow(2).add(height.pow(2))).sqrt(mc);
    }

    @Override
    public BigDecimal getArea() {
        return pi.multiply((radius()).pow(2))
                .add(pi.multiply(radius()).multiply(sideOfCone()));
    }

    @Override
    public BigDecimal getPerimeter() {
        return (width.multiply(pi)).add(sideOfCone().multiply(BigDecimal.valueOf(2)));
    }

    @Override
    public BigDecimal calculateVolume() {
        return ((pi.multiply(radius().pow(2))).multiply(height)).divide(BigDecimal.valueOf(3), roundingMode);
    }
}
