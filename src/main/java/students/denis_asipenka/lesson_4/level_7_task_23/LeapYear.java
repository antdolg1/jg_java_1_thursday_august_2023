package students.denis_asipenka.lesson_4.level_7_task_23;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else return false;
    }
}
