package org.epam.task2;

public enum Months {
    JANUARY(1, 31, "January"),
    FEBRUARY(32, 59, "February"),
    MARCH(60, 90, "March"),
    APRIL(91, 120, "April"),
    MAY(121, 151, "May"),
    JUNE(152, 181, "June"),
    JULY(182, 212, "July"),
    AUGUST(213, 243, "August"),
    SEPTEMBER(244, 273, "September"),
    OCTOBER(274, 304, "October"),
    NOVEMBER(305, 334, "November"),
    DECEMBER(335, 365, "December");

    private final int firstDayNumber;
    private final int lastDayNumber;
    private final String name;

    Months(int firstDayNumber, int lastDayNumber, String name) {
        this.firstDayNumber = firstDayNumber;
        this.lastDayNumber = lastDayNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDayInMonth(int dayNumber) {
        return dayNumber + 1 - firstDayNumber;
    }

    public boolean isDayInMonth(int dayNumber) {
        return dayNumber >= firstDayNumber && dayNumber <= lastDayNumber;
    }
}
