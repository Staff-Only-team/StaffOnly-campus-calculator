package com.staff_only.campus;

public class CommuteService {

    public String getAdvice(int monthlyFare, int passPrice, int difference) {

        if (monthlyFare > passPrice) {
            return "정기권이 " + difference + "원 더 쌉니다.";
        } else if (monthlyFare < passPrice) {
            return "그냥 타는 게 " + difference + "원 더 쌉니다.";
        }

        return "두 방법의 요금이 같습니다.";
    }

    public String recommend(int oneWayFare, int days, int passPrice) {

        if (oneWayFare <= 0 || days <= 0 || passPrice <= 0) {
            return "요금, 등교일, 정기권 가격은 모두 1 이상이어야 합니다.";
        }

        FareCalculator calculator = new FareCalculator();

        int monthlyFare = calculator.getMonthlyFare(oneWayFare, days);

        int difference = calculator.getDifference(monthlyFare, passPrice);

        String advice = getAdvice(monthlyFare, passPrice, difference);

        return "한 달 교통비 " + monthlyFare
                + "원, 정기권 " + passPrice
                + "원: " + advice;
    }
}