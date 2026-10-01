package com.staff_only.campus;

public class WageService {


    //주휴수당
    public int getHolidayHours(int hours){
        return (hours > 40) ? 40 : hours;
    }

    //급여 계산
    public String makePayslip(int wage, int hours){

        //입력검사
        if(wage <= 0 || hours <= 0) {
            return "시급과 근무시간은 1 이상이여야 합니다.";
        }else {
            WageCalculator wcalc = new WageCalculator();
            int nw = wcalc.getPay(wage,hours); //기본급

            //주휴시간(hh) 판별
            if (hours<15) {
                return ("기본급 "+ nw +"원 (주 15시간 미만이라 주휴수당 없음)");
            }else{
                int hh = getHolidayHours(hours); //주휴시간 확인(40 || hours)
                int hw= wcalc.getHolidayPay(wage,hh); //주휴수당 계산
                return ("기본급 "+nw+"원 +"+" 주휴수당 "+hw+"원 = 총 " + (nw+hw)+"원");
            }
        }

    }

}
