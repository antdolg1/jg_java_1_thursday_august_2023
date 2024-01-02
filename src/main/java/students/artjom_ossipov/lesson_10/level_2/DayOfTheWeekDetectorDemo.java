package students.artjom_ossipov.lesson_10.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public DayOfTheWeekDetectorDemo(){
    }
    private DayOfTheWeekDetector version;
    public DayOfTheWeekDetectorDemo (DayOfTheWeekDetector version) {
        this.version = version;
    }
    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of the week from 1 to 7");
        int numberOfWeek = scanner.nextInt();
        String result = version.detectDayName(numberOfWeek);
        System.out.println(result);
    }
    public static void main (String[] args) {
        DayOfTheWeekDetectorVersionArray arrayVersion = new DayOfTheWeekDetectorVersionArray();
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(arrayVersion);
        demo.run(); // вывод на массив версию

        /*
        DayOfTheWeekDetectorVersionSwitch switchVersion = new DayOfTheWeekDetectorVersionSwitch();
        DayOfTheWeekDetectorDemo demoSecond = new DayOfTheWeekDetectorDemo(switchVersion);
        demoSecond.run(); // вывод на свитч версию

        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demoThird = new DayOfTheWeekDetectorDemo(switchVersion);
        demoThird.run(); // вывод на иф версию
        */

    }
}
