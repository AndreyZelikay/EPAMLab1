package org.epam.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isIncreasing = true;
        boolean isSameNumbersPairExist = false;
        boolean isAlternating = true;

        Scanner scanner = new Scanner(System.in);

        long buffer = scanner.nextLong();
        long currentValue;

        while((currentValue = scanner.nextLong()) != 0) {
            if(isIncreasing && currentValue <= buffer) {
                isIncreasing = false;
            }

            if(!isSameNumbersPairExist && buffer == currentValue) {
                isSameNumbersPairExist = true;
            }

            if(isAlternating && Math.signum(buffer) == Math.signum(currentValue)) {
                isAlternating = false;
            }

            buffer = currentValue;
        }

        System.out.println("is increasing sequence " + isIncreasing);
        System.out.println("is same numbers pair exist " + isSameNumbersPairExist);
        System.out.println("is alternating sequence " + isAlternating);
    }
}
