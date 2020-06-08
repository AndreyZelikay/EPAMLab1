package org.epam.task1.main;

public class Main {

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 7;

        try {
            double result = calcExpression(a, b, c);

            System.err.print("Result " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static double calcExpression(double a, double b, double c) {
        double valueUnderRoot = Math.pow(b, 2) + 4 * a * c;

        if(valueUnderRoot < 0) {
            throw new IllegalArgumentException("Incorrect input: value under square root is lower then 0");
        }

        if(a == 0 || b == 0) {
            throw new IllegalArgumentException("Incorrect input: denominator is equal to 0");
        }

        return (b + Math.sqrt(valueUnderRoot)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
