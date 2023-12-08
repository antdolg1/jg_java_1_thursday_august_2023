package students.artjom_ossipov.lesson_10.level_2;

public class DayOfTheWeekDetectorVersionArray implements DayOfTheWeekDetector {
    @Override
    public String detectDayName (int number){
        String[] weekArray = new String[7];
        weekArray[0] = "Monday";
        weekArray[1] = "Tuesday";
        weekArray[2] = "Wednesday";
        weekArray[3] = "Thursday";
        weekArray[4] = "Friday";
        weekArray[5] = "Saturday";
        weekArray[6] = "Sunday";
        if (number > 7){
            return "input a number between 1 and 7";
        } else if (number < 1) {
            return "input a number between 1 and 7";
        } else {
            return weekArray[number - 1];
        }
    }
    public static void main (String[] args){
        DayOfTheWeekDetectorVersionArray dayOfTheWeekDetectorVersionArray = new DayOfTheWeekDetectorVersionArray();
        System.out.println(dayOfTheWeekDetectorVersionArray.detectDayName(3));
    }
}
