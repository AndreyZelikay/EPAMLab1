package org.epam.task2;

public class Main {

    public static void main(String[] args) {
        int dayNumber = 1;

        System.err.println(getDayAndMonth(dayNumber));
    }

    public static DayAndMonth getDayAndMonth(int dayNumberInYear) {
        if(dayNumberInYear <= 0) {
            throw new IllegalArgumentException("illegal day number");
        }

        int monthNumber = 1;
        int countedDayNumber = 1;
        int numberDaysInMonth = 31;

        while (countedDayNumber + numberDaysInMonth <= dayNumberInYear) {
            countedDayNumber += numberDaysInMonth;
            monthNumber++;

            switch (monthNumber) {
                case 1, 3, 5, 7, 8, 10, 12 ->numberDaysInMonth = 31;
                case 4, 6, 9, 11 -> numberDaysInMonth = 30;
                case 2 -> numberDaysInMonth = 28;
            }
        }

        return new DayAndMonth(monthNumber, dayNumberInYear - countedDayNumber + 1);
    }

    private static class DayAndMonth {
        public final int monthNumber;
        public final int dayNumber;

        public DayAndMonth(int monthNumber, int dayNumber) {
            this.monthNumber = monthNumber;
            this.dayNumber = dayNumber;
        }

        @Override
        public String toString() {
            return String.format("month: %d day: %d", monthNumber, dayNumber);
        }
    }
}
