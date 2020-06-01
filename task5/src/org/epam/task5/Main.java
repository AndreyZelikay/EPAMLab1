package org.epam.task5;

public class Main {

    public static void main(String[] args) {
        int value = 101;

        Numeric numeric = new Numeric(value);

        System.out.println("1) " + numeric.getFiguresSum() + " " + numeric.getFiguresProduct());

        numeric.reverseFigures(1, 2);

        System.out.println("2) " + numeric.getValue());

        numeric.reverseFigures(1, 2);

        numeric.insertFigure(0, numeric.getFigure(2));

        System.out.println("3) " + numeric.getValue());
    }
}
