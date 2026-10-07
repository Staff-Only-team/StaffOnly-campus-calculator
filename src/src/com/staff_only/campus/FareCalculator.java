package com.staff_only.campus;

public class FareCalculator {

    public int getMonthlyFare(int oneWayFare, int days) {
        return oneWayFare * 2 * days;
    }

    public int getDifference(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}