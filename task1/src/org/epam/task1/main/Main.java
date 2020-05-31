package org.epam.task1.main;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Input a");

        BigDecimal a = scanner.nextBigDecimal();

        System.err.println("Input b");

        BigDecimal b = scanner.nextBigDecimal();

        System.err.println("Input c");

        BigDecimal c = scanner.nextBigDecimal();

        System.err.println("Input precision");

        int precision = scanner.nextInt();

        try {
            BigDecimal result = solveEquation(a, b, c, precision);

            System.err.print("Result " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static BigDecimal solveEquation(BigDecimal a, BigDecimal b, BigDecimal c, int precision) {
        BigDecimal valueUnderRoot = b.pow(2).add(BigDecimal.valueOf(4).multiply(a).multiply(c));

        if(valueUnderRoot.signum() < 0) {
            throw new IllegalArgumentException("Incorrect input: value under square root is lower then 0");
        }

        if(a.signum() == 0 || b.signum() == 0) {
            throw new IllegalArgumentException("Incorrect input: denominator is equal to 0");
        }

        MathContext mc = new MathContext(precision);

        return ((b.add(valueUnderRoot.sqrt(mc)))
                .divide(BigDecimal.valueOf(2).multiply(a), mc))
                .subtract(a.pow(3).multiply(c))
                .add(BigDecimal.ONE.divide(b.pow(2), mc));
    }
}
