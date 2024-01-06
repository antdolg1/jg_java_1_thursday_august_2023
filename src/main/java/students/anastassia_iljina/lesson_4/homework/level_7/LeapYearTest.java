package students.anastassia_iljina.lesson_4.homework.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.isLeapYear();
        test.isNotLeapYear();
    }

    public void isLeapYear() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2000)) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }

        if (leapYear.isLeapYear(2012)) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }

        if (leapYear.isLeapYear(2020)) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

    public void isNotLeapYear() {
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(1900)) {
            System.out.println("Test OK!");
        } else {
            System.out.println("TEST FAIL!");
        }

        if (!leapYear.isLeapYear(2100)) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }

        if (!leapYear.isLeapYear(2019)) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("Test FAIL!");
        }
    }
}
