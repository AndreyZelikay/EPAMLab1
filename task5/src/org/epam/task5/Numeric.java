package org.epam.task5;

import java.util.Arrays;

public class Numeric {
    private final byte signum;
    private int[] figuresArray;

    public Numeric(int value) {
        this.signum = (byte) Math.signum(value);
        this.figuresArray = getFiguresArrayFromValue(value);
    }

    public int getValue() {
        int value = 0;

        for (int i = 0; i < figuresArray.length; i++) {
            value += figuresArray[i] * Math.pow(10, figuresArray.length - i - 1);
        }

        return value * signum;
    }

    public void insertFigure(int position, int figure) {
        if (position < 0 || position >= figuresArray.length) {
            throw new IllegalArgumentException();
        }

        int[] temp = new int[figuresArray.length + 1];

        System.arraycopy(figuresArray, 0, temp, 0, position);

        temp[position] = figure;

        System.arraycopy(figuresArray, position, temp, position + 1, figuresArray.length - position);

        figuresArray = temp;
    }

    public void reverseFigures(int firstPosition, int secondPosition) {
        if (firstPosition < 0
                || firstPosition >= figuresArray.length
                || secondPosition < 0
                || secondPosition >= figuresArray.length) {
            throw new IllegalArgumentException();
        }

        int temp = figuresArray[firstPosition];
        figuresArray[firstPosition] = figuresArray[secondPosition];
        figuresArray[secondPosition] = temp;
    }

    public long getFiguresSum() {
        return Arrays.stream(figuresArray).sum();
    }

    public long getFiguresProduct() {
        return Arrays.stream(figuresArray).reduce(1, (accumulator, actual) -> accumulator * actual);
    }

    public int getFigure(int position) {
        if (position < 0 || position >= figuresArray.length) {
            throw new IllegalArgumentException();
        }

        return figuresArray[position];
    }

    private static int[] getFiguresArrayFromValue(int value) {
        int degree = (int) Math.floor(Math.log(value) / Math.log(10)) + 1;

        int[] result = new int[degree];

        int temp = value;

        for (int i = degree - 1; i >= 0; i--) {
            result[i] = temp % 10;
            temp /= 10;
        }

        return result;
    }
}