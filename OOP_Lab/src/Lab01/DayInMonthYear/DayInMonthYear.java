package Lab01.DayInMonthYear;

import java.util.Scanner;

public class DayInMonthYear {
    public static  int checkLeapYear(int year){
       if(year % 4 != 0 ) return 0;
       if(year % 100 == 0 && year % 400 != 0) return 0;
       return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int check_input = 0 ,year = 0 , month = 0;
        String month_input ;
        while(check_input != 1){
            System.out.print("Enter month and year : ");
            month_input = sc.next();
            year = sc.nextInt();
            if(month_input.equals("January") || month_input.equals("Jan.") || month_input.equals("Jan") || month_input.equals("1")){
                check_input = 1;
                month = 1;
            }
            if(month_input.equals("February") || month_input .equals("Feb.") || month_input.equals("Feb") || month_input.equals("2")){
                check_input = 1;
                month = 2;
            }
            if(month_input.equals("March") || month_input.equals("Mar.") || month_input.equals("Mar") || month_input.equals("3")){
                check_input = 1;
                month = 3;
            }
            if(month_input.equals("April") || month_input.equals("Apr.") || month_input.equals("Apr") || month_input.equals("4")) {
                check_input = 1;
                month = 4;
            }
            if(month_input.equals("May") || month_input.equals("5")){
                check_input = 1;
                month = 5;
            }
            if(month_input.equals("June") || month_input.equals("Jun") || month_input.equals("6")){
                check_input = 1;
                month = 6;
            }
            if(month_input.equals("July") || month_input.equals("Jul") || month_input.equals("7")) {
                check_input = 1;
                month = 7;
            }
            if(month_input.equals("August") || month_input.equals("Aug.") || month_input.equals("Aug") || month_input.equals("8")) {
                check_input = 1;
                month = 8;
            }
            if(month_input.equals("September") || month_input.equals("Sep.") || month_input.equals("Sep") || month_input.equals("9")) {
                check_input = 1;
                month = 9;
            }
            if(month_input.equals("October") || month_input.equals("Oct.") || month_input.equals("Oct") || month_input.equals("10")) {
                check_input = 1;
                month = 10;
            }
            if(month_input.equals("November") || month_input.equals("Nov.") || month_input.equals("Nov") || month_input.equals("11")) {
                check_input = 1;
                month = 11;
            }
            if(month_input.equals("December") || month_input.equals("Dec.") || month_input.equals("Dec") || month_input.equals("12")) {
                check_input = 1;
                month = 12;
            }
            if(check_input == 0) System.out.println("Enter again");
        }
        switch (month){
            case 1,3,5,7,8,10,12 :
                System.out.println(31);
                break ;
            case 2:
                if(checkLeapYear(year) == 1) System.out.println(29);
                else System.out.println(28);
                break;
            case 4,6,9,11:
                System.out.println(30);
                break;
        }
    }
}
