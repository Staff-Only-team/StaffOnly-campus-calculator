package com.staff_only.campus;

public class DuesService {
    public String getMemberLine(int number, int share, int remainder) {
        String text;
        if (number == 1) {
            text = number + "번 (총무) : " + (share+remainder) + "원";
        }
        else {
            text = number + "번 : " + share + "원";
        }
        return text;

    }

    public void printSettlement(int total, int people) {
        if (total <= 0 || people <= 0) {
            System.out.println("총비용과 인원은 1 이상이어야 합니다.");
        }
        else {
            DuesCalculator duesCal = new DuesCalculator();
            int share = duesCal.getShare(total, people);
            int remain = duesCal.getRemainder(total, people);

            if (remain > 0) {
                System.out.println("1인당 " + share + "원 " + "(남는 " + remain + "원은 총무가 더 냅니다)");
            } else {
                System.out.println("1인당 " + share + "원 (딱 나누어떨어집니다)");
            }


            for (int i = 1; i <= people; i++) {
                String text = getMemberLine(i, share, remain);
                System.out.println(text);
            }

        }
    }
}
