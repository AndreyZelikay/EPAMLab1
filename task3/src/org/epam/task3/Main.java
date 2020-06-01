package org.epam.task3;

public class Main {

    public static void main(String[] args) {
        int a = -10;
        int b = -12;
        int c = -21;

        if (a > b && b > c) {
            System.err.println((a * 2) + " " + (b * 2) + " " + (c * 2));
        } else {
            System.err.println(Math.abs(a) + " " + Math.abs(b) + " " + Math.abs(c));
        }
    }
}
