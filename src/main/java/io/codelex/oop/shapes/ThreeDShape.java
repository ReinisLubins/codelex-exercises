package io.codelex.oop.shapes;

import java.math.BigDecimal;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(int numSides) {
        super(numSides);
    }

    public abstract BigDecimal calculateVolume();
}
