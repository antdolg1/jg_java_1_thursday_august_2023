package students.emilija_ostasevska.homework.lesson_6.level_2;

public class DayOfTheWeekDetectorDemo2 {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }

}

