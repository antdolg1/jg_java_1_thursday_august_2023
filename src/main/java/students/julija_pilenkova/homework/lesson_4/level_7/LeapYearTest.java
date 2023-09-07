package students.julija_pilenkova.homework.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {


        LeapYear leapYear = new LeapYear();
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.ifYearNotDevidedBy4(2023);
        leapYearTest.ifYearIsDevidedBy4NotDevidedBy100(2024);
        leapYearTest.ifYearIsDevidedBy4AndDevidedBy100andDevidedBy400(2020);
        leapYearTest.ifYearIsDevidedBy4AndDevidedBy100andNotDevidedBy400(2021);

    }

    void ifYearNotDevidedBy4(int year) {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(2023), "if year is not devided by 4 - its regular year.");
    }

    void ifYearIsDevidedBy4NotDevidedBy100(int year) {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(2024), "If Year is devided by 4 and not devided by 100 - its Leap year.");
    }

    void ifYearIsDevidedBy4AndDevidedBy100andDevidedBy400(int year) {
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(2020), "If year is devided by 4 and 100 and 400 - year is leap.");
    }

    void ifYearIsDevidedBy4AndDevidedBy100andNotDevidedBy400(int year) {
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(2021), "If year is devided by 4 and 100 and not devided by 400 -its normal year.");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
