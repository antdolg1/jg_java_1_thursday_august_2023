package students.julija_pilenkova.homework.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter number of the week: ");
        return scanner.nextInt();
    }

    String findDayOfTheWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Incorrect number";
            }
        }
    }
}