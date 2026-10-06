package com.staff_only.campus;

public class ScoreCalculator {

    //7. 총점 계산파트, 변수 넘겨받음
    public int sum (int score1, int score2, int score3){
        //되돌림
        return score1 + score2 + score3;

    }


    //6. 변수 넘겨 받음
    public int getSum (int score1, int score2, int score3) {
        //8. 총점을 total 변수로 만듦
        int total = sum(score1, score2, score3);
        return total;
    }

    //7. 변수 넘겨받음
    public double getAverage (double total){
        //12. 평균 변수 설정
        double average = divide(total);
        return average;
    }

    //11. 평균 계산 파트, 변수 넘겨받음
    public double divide (double total){
        //되돌림
        return total / 3;

    }

    //최솟값 찾기
    public int getMin (int score1, int score2, int score3) {
            int min = score1;

            if (score2 < min) {
                min = score2;
            }

            if (score3 < min) {
                min = score3;
            }
            return min;
        }
    }