package org.epam.task6;

public class Main {

    public static void main(String[] args) {
        int firstElement = 12;
        int step = -30;

        System.out.println("int overflow " + findIntOverflow(firstElement, step));
        System.out.println("long overflow " + findLongOverflow(firstElement, step));
    }

    public static int findIntOverflow(int firstElement, int step) {
        int sum = firstElement;
        int n = 1;

        while((step < 0 && sum <= firstElement) ||
                (step > 0 && sum >= firstElement)) {
            sum += firstElement + n * step;
            n++;
        }

        return n;
    }

    public static long findLongOverflow(int firstElement, int step) {
        long sum = firstElement;
        long n = 1;

        while((step < 0 && sum <= firstElement) ||
                (step > 0 && sum >= firstElement)) {
            sum += firstElement + n * step;
            n++;
        }

        return n;
    }

}