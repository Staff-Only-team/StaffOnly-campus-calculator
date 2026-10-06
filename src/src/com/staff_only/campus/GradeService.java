package com.staff_only.campus;

public class GradeService {

    //3. 변수 넘겨 받음
    public String makeReport (int score1, int score2, int score3) {
        //4. 객체 생성
        ScoreCalculator sc = new ScoreCalculator();

        //5. 넘겨받은 변수를 도구로 넘긴다
        int min = sc.getMin(score1, score2, score3);


        int sum = sc.getSum(score1, score2, score3);{
        }

        double divide = sc.getAverage(sum);
        String grade;
            if (min <= 40) {
                grade = "F";
        }
            else if (divide >= 90) {
                grade = "A";
            }
            else if (divide >= 80) {
            grade = "B";
            }
            else if (divide >= 70) {
            grade = "C";
            }
            else if (divide >= 60) {
            grade = "D";
            }
            else{
            grade = "F";
            }

            return "총 점 "  + sum + "평균 " + divide + "등급 " + grade;
        }


    }
