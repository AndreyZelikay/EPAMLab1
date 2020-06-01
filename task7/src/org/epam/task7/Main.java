package org.epam.task7;

public class Main {

    public static void main(String[] args) {
        double value = 123.456;

        int integerPart = (int) value;
        int doublePart = (int) Math.round((value - integerPart) * 1000);

        double result = doublePart + (double) integerPart / 1000;

        System.out.println(result);
    }
}
