package students.nikolajs_antonovs.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {
    static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.returnMonday();
        test.returnTuesday();
        test.returnWednesday();
        test.returnThursday();
        test.returnFriday();
        test.returnSaturday();
        test.returnSunday();
        test.returnWrongDayNumber();
    }

    void returnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Monday";
        String actual = detector.findDayOfTheWeek(1);
        result(expected, actual, "Monday");
    }

    void returnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Tuesday";
        String actual = detector.findDayOfTheWeek(2);
        result(expected, actual, "Tuesday");
    }

    void returnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Wednesday";
        String actual = detector.findDayOfTheWeek(3);
        result(expected, actual, "Wednesday");
    }

    void returnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Thursday";
        String actual = detector.findDayOfTheWeek(4);
        result(expected, actual, "Thursday");
    }

    void returnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Friday";
        String actual = detector.findDayOfTheWeek(5);
        result(expected, actual, "Friday");
    }

    void returnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Saturday";
        String actual = detector.findDayOfTheWeek(6);
        result(expected, actual, "Saturday");
    }

    void returnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Sunday";
        String actual = detector.findDayOfTheWeek(7);
        result(expected, actual, "Sunday");
    }

    void returnWrongDayNumber() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String expected = "Not correct day number";
        String actual = detector.findDayOfTheWeek(8);
        result(expected, actual, "Not correct day number");
    }

    void result(String expected, String actual, String day) {
        if (expected.equals(actual)) {
            System.out.println(day + " Ok");
        } else {
            System.out.println(day + " Failed");
        }
    }
}
