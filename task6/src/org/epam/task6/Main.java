package org.epam.task6;

import java.math.BigInteger;

public class Main {

    private static final int INTEGER_INFINITY = (int) Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        int firstElement = 12;
        int step = -30;

        long currentSum = firstElement;
        BigInteger n = BigInteger.ZERO;

        while (currentSum <= INTEGER_INFINITY && currentSum >= -INTEGER_INFINITY) {
            currentSum += firstElement + n.multiply(BigInteger.valueOf(step)).longValue();
            n = n.add(BigInteger.ONE);
        }

        System.out.println("Integer overflow: " + n);

        while (true) {
            try {
                currentSum = Math.addExact(currentSum, Math.addExact(firstElement, n.multiply(BigInteger.valueOf(step)).longValue()));
                n = n.add(BigInteger.ONE);
            } catch (ArithmeticException e) {
                n = n.add(BigInteger.ONE);
                System.out.println("Long overflow: " + n);
                break;
            }
        }
    }
}
