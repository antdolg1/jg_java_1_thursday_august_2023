package students.julija_pilenkova.homework.lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnIncorrectNumber();
    }

    void shouldReturnMonday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(1);
        checkResult("Monday".equals(dayOfTheWeek), "Monday test is - ");
    }

    void shouldReturnTuesday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(2);
        checkResult("Tuesday".equals(dayOfTheWeek), "Tueday test is - ");
    }

    void shouldReturnWednesday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(3);
        checkResult("Wednesday".equals(dayOfTheWeek), "Wednesday test is - ");
    }

    void shouldReturnThursday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(4);
        checkResult("Thursday".equals(dayOfTheWeek), "Thursday test is - ");
    }

    void shouldReturnFriday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(5);
        checkResult("Friday".equals(dayOfTheWeek), "Friday test is - ");
    }

    void shouldReturnSaturday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(6);
        checkResult("Saturday".equals(dayOfTheWeek), "Saturday test is - ");
    }

    void shouldReturnSunday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(7);
        checkResult("Sunday".equals(dayOfTheWeek), "Sunday test is - ");
    }

    void shouldReturnIncorrectNumber() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String dayOfTheWeek = test.findDayOfTheWeek(13);
        checkResult("Incorrect number".equals(dayOfTheWeek), "Incorrect number test is - ");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}