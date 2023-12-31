package students.emilija_ostasevska.homework.lesson_10.level_2;

// Интерфейс DayOfTheWeekDetector
interface DayOfTheWeekDetector {
    String detectDayName(int number);
}

// Реализация интерфейса с использованием if
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return daysOfWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

// Реализация интерфейса с использованием switch
class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Please input a valid number between 1 and 7";
        }
    }
}

// Реализация интерфейса с использованием массива строк
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return daysOfWeek[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

// Тестирование всех имплементаций
class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        testDetector(new DayOfTheWeekDetectorIfVersion());
        testDetector(new DayOfTheWeekDetectorSwitchVersion());
        testDetector(new DayOfTheWeekDetectorArrayVersion());
    }

    private static void testDetector(DayOfTheWeekDetector detector) {
        System.out.println(detector.detectDayName(1));
        System.out.println(detector.detectDayName(4));
        System.out.println(detector.detectDayName(7));
        System.out.println(detector.detectDayName(8));
        System.out.println();
    }
}

