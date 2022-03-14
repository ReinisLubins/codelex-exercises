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
        if (firstDate.isBefore(secondPeriod.firstDate) && secondDate.isAfter(secondPeriod.firstDate)) { // -_
            return new DatePeriod(secondPeriod.firstDate, secondDate);
        } else if (firstDate.isBefore(secondPeriod.secondDate) && secondDate.isAfter(secondPeriod.secondDate)) { // _-
            return new DatePeriod(firstDate, secondPeriod.secondDate);
        } else if (firstDate.isAfter(secondPeriod.firstDate) && secondDate.isBefore(secondPeriod.secondDate)) { // =
            return new DatePeriod(firstDate, secondDate);
        } else if (secondPeriod.firstDate.isAfter(firstDate) && secondPeriod.secondDate.isBefore(secondDate)) { // =
            return new DatePeriod(secondPeriod.firstDate, secondPeriod.secondDate);
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

