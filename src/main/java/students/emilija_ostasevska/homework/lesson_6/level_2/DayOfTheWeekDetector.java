package students.emilija_ostasevska.homework.lesson_6.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetector{
    public int getDayNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input day number between 1 and 7 : ");
        int dayNumber = sc.nextInt();
        sc.close();
        return dayNumber;
    }
    public String findDayOfTheWeek(int dayNumber){
        switch (dayNumber){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Not correct day number";
        }
    }
}

class Main{
    public static void main(String[] args) {
        DayOfTheWeekDetector dayDetect = new DayOfTheWeekDetector();
        int userNumber = dayDetect.getDayNumberFromUser();
        String answer = dayDetect.findDayOfTheWeek(userNumber);
        System.out.println(answer);
    }
}