package org.epam.task2;

import java.util.Arrays;
import java.util.Optional;

public class CustomCalendar {
    private final int dayNumberInYear;

    public CustomCalendar(int dayNumberInYear) {
        if(dayNumberInYear <= 0) {
            throw new IllegalArgumentException("illegal day number");
        }

        this.dayNumberInYear = dayNumberInYear;
    }

    public String getMonthName() {
        return Arrays.stream(Months.values())
                .filter(months -> months.isDayInMonth(dayNumberInYear))
                .findFirst().map(Months::getName).orElse("");
    }

    public int getDayInMonth() {
        return Arrays.stream(Months.values())
                .filter(months -> months.isDayInMonth(dayNumberInYear))
                .findFirst().map(months -> months.getDayInMonth(dayNumberInYear)).orElse(0);
    }
}
