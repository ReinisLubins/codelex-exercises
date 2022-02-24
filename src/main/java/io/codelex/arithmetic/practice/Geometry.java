package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) throws Exception {
        if (radius.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new Exception("Error: input value is negative");
        } else
        {
            BigDecimal pi = new BigDecimal(Math.PI * 2);
            return radius.multiply(pi).doubleValue();
        }
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) throws Exception {
        if (length.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new Exception("Error: input value is negative");
        } else if (width.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new Exception("Error: input value is negative");
        }else
        {
            return length.multiply(width).doubleValue();
        }
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) throws Exception {
        if (base.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new Exception("Error: input value is negative");
        } else if (h.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new Exception("Error: input value is negative");
        } else
        {
            BigDecimal valueToAdd = new BigDecimal(0.5);
            return base.multiply(h).multiply(valueToAdd).doubleValue();
        }
    }
}
