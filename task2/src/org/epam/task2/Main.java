package org.epam.task2;

public class Main {

    public static void main(String[] args) {
        int dayNumber = 265;

        CustomCalendar calendar = new CustomCalendar(dayNumber);

        System.err.println(calendar.getDayInMonth() + " " + calendar.getMonthName());
    }
}
