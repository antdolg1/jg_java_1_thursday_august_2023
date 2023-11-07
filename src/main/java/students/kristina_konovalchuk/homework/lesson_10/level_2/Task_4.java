package students.kristina_konovalchuk.homework.lesson_10.level_2;

public class Task_4 {
    public interface DayOfTheWeekDetector {
        String detectDayName(int number);
    }

    public static class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector {
        public String detectDayName(int number) {
            if (number == 1) {
                return "Monday";
            } else if (number == 2) {
                return "Tuesday";
            } else if (number == 3) {
                return "Wednesday";
            } else if (number == 4) {
                return "Thursday";
            } else if (number == 5) {
                return "Friday";
            } else if (number == 6) {
                return "Saturday";
            } else if (number == 7) {
                return "Sunday";
            } else {
                return "Please input a valid number between 1 and 7";
            }
        }
    }

    public static class DayOfTheWeekDetectorSwitch implements DayOfTheWeekDetector {
        public String detectDayName(int number) {
            switch (number) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
                default:
                    return "Please input a valid number between 1 and 7";
            }
        }
    }

    public static class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {
        private static final String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        public String detectDayName(int number) {
            if (number < 1 || number > 7) {
                return "Please input a valid number between 1 and 7";
            }
            return daysOfWeek[number - 1];
        }
    }
}
