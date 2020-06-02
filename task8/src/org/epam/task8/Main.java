package org.epam.task8;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = new BigDecimal("20");
        BigDecimal h = new BigDecimal("0.5");
        BigDecimal c = new BigDecimal("4");

        LinkedList<BigDecimal[]> result = new LinkedList<>();

        for(BigDecimal x = a; x.compareTo(b) <= 0; x = x.add(h)) {
            result.add(new BigDecimal[]{x, func(x, c)});
        }

        for(BigDecimal[] value: result) {
            System.out.println("x: " + value[0] + " f(x) = " + value[1]);
        }
    }

    public static BigDecimal func(BigDecimal x, BigDecimal c) {
        if(x.compareTo(BigDecimal.valueOf(15)) == 0) {
            return x.add(c).multiply(BigDecimal.valueOf(2));
        }

        return x.subtract(c).add(BigDecimal.valueOf(6));
    }
}
