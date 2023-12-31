package students.emilija_ostasevska.homework.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    private final DayOfTheWeekDetector detector;

    // Конструктор, принимающий реализацию интерфейса DayOfTheWeekDetector
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    // Метод, реализующий программу
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();

        String dayName = detector.detectDayName(number);

        System.out.println("Day of the week: " + dayName);
    }

    // Метод main для демонстрации использования
    public static void main(String[] args) {
        // Создание экземпляра с разными реализациями
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());

        // Запуск программы для каждой реализации
        demo1.run();
        demo2.run();
        demo3.run();
    }
}

