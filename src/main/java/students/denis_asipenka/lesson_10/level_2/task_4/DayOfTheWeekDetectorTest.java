package students.denis_asipenka.lesson_10.level_2.task_4;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.massVersion();
        test.switchVersion();
        test.ifVersion();
    }

    void massVersion() {
        int numberWeek = 7;
        String result = "Sunday";
        DayOfTheWeekDetectorMassVersion dayOfTheWeekDetectorMassVersion = new DayOfTheWeekDetectorMassVersion();
        checkResult(dayOfTheWeekDetectorMassVersion.detectDayName(numberWeek).equalsIgnoreCase(result), "Тест на определения дня недели через массив: ");
    }

    void switchVersion() {
        int numberWeek = 7;
        String result = "Sunday";
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        checkResult(dayOfTheWeekDetectorSwitchVersion.detectDayName(numberWeek).equalsIgnoreCase(result), "Тест на определения дня недели через switch: ");
    }

    void ifVersion() {
        int numberWeek = 1;
        String result = "Monday";
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        checkResult(dayOfTheWeekDetectorIfVersion.detectDayName(numberWeek).equalsIgnoreCase(result), "Тест на определения дня недели через switch: ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}