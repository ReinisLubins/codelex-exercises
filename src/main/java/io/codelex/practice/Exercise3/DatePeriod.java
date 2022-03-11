package io.codelex.practice.Exercise3;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate firstDate;
    private LocalDate secondDate;

    public DatePeriod(LocalDate firstDate, LocalDate secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (firstDate.isBefore(secondPeriod.firstDate) && secondDate.isAfter(secondPeriod.firstDate)) {
            return new DatePeriod(secondPeriod.firstDate, secondDate);
        } else if (firstDate.isBefore(secondPeriod.secondDate) && secondDate.isAfter(secondPeriod.secondDate)) {
            return new DatePeriod(firstDate, secondPeriod.secondDate);
        } else {
            return null;
        }
    }

    public LocalDate getFirstDate() {
        return firstDate;
    }

    public LocalDate getSecondDate() {
        return secondDate;
    }
}

