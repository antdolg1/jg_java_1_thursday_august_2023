package students.denis_asipenka.lesson_10.level_2.task_4;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    public DayOfTheWeekDetectorDemo() {
    }

    private DayOfTheWeekDetector version;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector version) {
        this.version = version;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели (ЦИФРУ)");
        int numberWeek = scanner.nextInt();
        String result = version.detectDayName(numberWeek);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorMassVersion massVersion = new DayOfTheWeekDetectorMassVersion();
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(massVersion);
        demo.run();
    }
}