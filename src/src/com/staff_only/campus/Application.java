package com.staff_only.campus; // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("1. 알바 급여");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;

                case 1:
                    System.out.print("시급 : ");
                    int wage = sc.nextInt();
                    System.out.print("이번 주 근무 시간 : ");
                    int hours = sc.nextInt();

                    WageService wserv = new WageService();
                    String str = wserv.makePayslip(wage, hours);
                    System.out.println(str);
                    break;


                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}