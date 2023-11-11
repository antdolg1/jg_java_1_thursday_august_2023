package students.julija_pilenkova.homework.lesson_4.level_7;

class LeapYear {

    boolean isLeapYear(int year) {
        if (year % 4 != 00) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }


}

