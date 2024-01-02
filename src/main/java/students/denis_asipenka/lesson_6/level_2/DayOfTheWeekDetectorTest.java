package students.denis_asipenka.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.shouldReturnMonday();
        dayOfTheWeekDetectorTest.shouldReturnTuesday();
        dayOfTheWeekDetectorTest.shouldReturnWednesday();
        dayOfTheWeekDetectorTest.shouldReturnThursday();
        dayOfTheWeekDetectorTest.shouldReturnFriday();
        dayOfTheWeekDetectorTest.shouldReturnSaturday();
        dayOfTheWeekDetectorTest.shouldReturnSunday();
        dayOfTheWeekDetectorTest.shouldReturnNotDayOfWeek();

    }

    public void shouldReturnMonday() {
        int numbersDayOfWeek = 1;
        String result = "Monday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnTuesday() {
        int numbersDayOfWeek = 2;
        String result = "Tuesday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnWednesday() {
        int numbersDayOfWeek = 3;
        String result = "Wednesday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnThursday() {
        int numbersDayOfWeek = 4;
        String result = "Thursday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnFriday() {
        int numbersDayOfWeek = 5;
        String result = "Friday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnSaturday() {
        int numbersDayOfWeek = 6;
        String result = "Saturday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnSunday() {
        int numbersDayOfWeek = 7;
        String result = "Sunday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    public void shouldReturnNotDayOfWeek() {
        int numbersDayOfWeek = 8;
        String result = "Not correct day number";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(numbersDayOfWeek);
        checkTestResult(result.equals(dayOfTheWeek), result);
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}