package teacher.lesson_8.lessoncode;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 10, 5); //October 5, 2023

        LocalDate currentDate = LocalDate.now(); //current date
        System.out.println(currentDate);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.printf("Year: %d, month: %d, day: %d", year, month, day);

        String monthString = date.getMonth().name();
        System.out.println();
        System.out.println(monthString);

        LocalDate tomorrow = date.plusDays(1);
        LocalDate lastMonth = date.minusMonths(1);
        LocalDate nextYear = date.plusYears(1);

        System.out.println("Tomorrow: " + tomorrow + "/ previous month: " + lastMonth + "/ next year: " + nextYear);

        LocalDate futureDate = LocalDate.of(2023, 12, 31);

        if (nextYear.isBefore(futureDate)) {
            System.out.println("Date is before the future date");
        } else if (nextYear.isAfter(futureDate)) {
            System.out.println("Date is after the future date");
        } else {
            System.out.println("Date is the same as the future date");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        int year2024 = 2024;
        boolean isLeapYear = LocalDate.ofYearDay(year2024, 1).isLeapYear();
        System.out.println(year2024 + " is a leap year: " + isLeapYear);

        boolean isWeekend = date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        System.out.println("Is it the weekend? " + isWeekend);

        String dateString = "2023-12-31";
        LocalDate parsedDate = LocalDate.parse(dateString);

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days in 2024: " + daysBetween);



    }
}
