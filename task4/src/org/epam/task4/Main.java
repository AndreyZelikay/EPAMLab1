package org.epam.task4;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {

    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("14");
        int precision = 10;

        System.err.println(func(value, precision));
    }

    private static BigDecimal func(BigDecimal x, int precision) {
        if(x.compareTo(BigDecimal.valueOf(13)) <= 0) {
            return BigDecimal.valueOf(9).subtract(x.pow(3));
        } else {
            return BigDecimal.valueOf(3)
                    .divide(x.add(BigDecimal.ONE), new MathContext(precision))
                    .multiply(BigDecimal.valueOf(-1));
        }
    }
}
