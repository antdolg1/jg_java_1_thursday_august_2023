package students.anastassia_iljina.lesson_4.homework.level_7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 != 0 ) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
