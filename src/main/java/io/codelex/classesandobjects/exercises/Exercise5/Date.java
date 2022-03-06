package io.codelex.classesandobjects.exercises.Exercise5;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = setCorrectDay(day);
        this.month = setCorrectMonth(month);
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 30) {
            this.day = day;
        } else {
            while (day > 30) {
                day -= 30;
            }
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 12) {
            this.month = month;
        } else {
            while (month > 12) {
                month -= 12;
            }
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
    }

    public int setCorrectDay(int day) {
        if (day > 30) {
            while (day > 30) {
                day -= 30;
            }
        }
        return day;
    }

    public int setCorrectMonth(int month) {
        if (month > 12) {
            while (month > 12) {
                month -= 12;
            }
        }
        return month;
    }
}

