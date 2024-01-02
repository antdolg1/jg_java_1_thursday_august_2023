package students.aleksandrs_kunicins.homework.lesson_6.level_2_intern;
class DayOfTheWeekDetectorTest{
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWenesday();
        test.shouldReturnThuersday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnIncorrect();
    }
    public void shouldReturnMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }
    private void checkTestResult(boolean condition,String testName){
        if (condition){
            System.out.println(testName + " = OK!");
        }else{
            System.out.println(testName +" = FAIL!");
        }
    }
    public void shouldReturnTuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfWeek), "Tuesday");
    }
    public void shouldReturnWenesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wenesday".equals(dayOfTheWeek), "Wenesday");
    }
    public void shouldReturnThuersday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thuersday".equals(dayOfTheWeek), "Thuersday");
    }
    public void shouldReturnFriday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }
    public void shouldReturnSaturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }
    public void shouldReturnSunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }
    public void shouldReturnIncorrect(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
    }
}