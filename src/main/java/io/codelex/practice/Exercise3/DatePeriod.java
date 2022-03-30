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
        LocalDate firstPeriodDateNo1 = firstDate;
        LocalDate firstPeriodDateNo2 = secondDate;
        LocalDate secondPeriodDateNo1 = secondPeriod.firstDate;
        LocalDate secondPeriodDateNo2 = secondPeriod.secondDate;

        if (firstPeriodDateNo1.isBefore(secondPeriodDateNo1) && firstPeriodDateNo2.isAfter(secondPeriodDateNo1)) { // -_
            return new DatePeriod(secondPeriodDateNo1, firstPeriodDateNo2);
        } else if (firstPeriodDateNo1.isBefore(secondPeriodDateNo2) && firstPeriodDateNo2.isAfter(secondPeriodDateNo2)) { // _-
            return new DatePeriod(firstPeriodDateNo1, secondPeriodDateNo2);
        } else if (firstPeriodDateNo1.isAfter(secondPeriodDateNo1) && firstPeriodDateNo2.isBefore(secondPeriodDateNo2)) { // =
            return new DatePeriod(firstPeriodDateNo1, firstPeriodDateNo2);
        } else if (secondPeriodDateNo1.isAfter(firstPeriodDateNo1) && secondPeriodDateNo2.isBefore(firstPeriodDateNo2)) { // =
            return new DatePeriod(secondPeriodDateNo1, secondPeriodDateNo2);
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

