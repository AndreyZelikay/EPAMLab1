package org.epam.task9;

public class Main {

    public static void main(String[] args) {
        long result = 1;

        for(int i = 1; i <= 10; i++) {
            result *= (1 + i) * i / 2;
        }

        System.out.println(result);
    }
}