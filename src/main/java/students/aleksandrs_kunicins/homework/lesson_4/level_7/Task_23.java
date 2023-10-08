package students.aleksandrs_kunicins.homework.lesson_4.level_7;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

class LeapYearTest {
    public static void main(String[] args) {
        int firstYear = 1900;
        int secondYear = 2000;
        int thirdYear = 2025;
        int fourthYear = 2023;
        boolean expectFirst = false;
        boolean expectSecond = true;
        boolean expectedThird = false;
        boolean extectFourth = false;
        LeapYear ly = new LeapYear();
        boolean realFirst = ly.isLeapYear(firstYear);
        boolean realSecond = ly.isLeapYear(secondYear);
        boolean realThird = ly.isLeapYear(thirdYear);
        boolean realFourth = ly.isLeapYear(fourthYear);

        if (realFirst == expectFirst) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        if (realSecond == expectSecond) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        if (realThird == expectedThird) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        if (realFourth == extectFourth) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}