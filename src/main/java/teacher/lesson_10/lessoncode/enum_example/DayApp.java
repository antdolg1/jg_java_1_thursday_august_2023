package teacher.lesson_10.lessoncode.enum_example;

import java.time.LocalDate;

public class DayApp {
    public static void main(String[] args) {

        LocalDate todayDate = LocalDate.now();
        String todayAsStringFromLocalDate = todayDate.getDayOfWeek().toString();
        System.out.println(todayAsStringFromLocalDate);

        DayEnum today = DayEnum.THURSDAY;
        String todayAsString = today.name();
        System.out.println(today);

        if (todayAsStringFromLocalDate.equals(todayAsString)) {
            System.out.println("Yes, today is Thursday");
        }

        if (today == DayEnum.THURSDAY) {
            System.out.println("Today is Thursday");
            System.out.println("Today is " + todayAsString);
            System.out.println("Сегодня " + today.getNameRus());
            System.out.println(today.getNameRus() + " является " + today.getOrder() + " днём недели!");
        }

        System.out.println();
        for(DayEnum day : DayEnum.values()) {
            System.out.println(day);
        }

    }
}
