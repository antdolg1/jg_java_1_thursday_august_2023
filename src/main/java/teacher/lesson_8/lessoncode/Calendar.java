package teacher.lesson_8.lessoncode;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {

        //In this step, get the current date using LocalDate.now(). Extract the name of the current month, numeric value of the month, and the current day of the month.
        LocalDate date = LocalDate.now();
        String monthName = date.getMonth().name();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();


        //Subtract today - 1 days from the current date to set the date to the first day of the current month.
        date = date.minusDays(today - 1); //set to the first day of the month

        //Determine the day of the week for the first day of the month and obtain its numeric value (1 for Monday, 2 for Tuesday, and so on).
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); //1 - Monday, 2 - Tuesday...

        //Print a new line, the name of the current month, and the headers for the days of the week.
        System.out.println();
        System.out.println(monthName);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        //Print spaces to align the first day of the month with the correct column for the day of the week.
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        //Using a loop, print the days of the month. Format the day to take 3 characters.
        // If the current day is today, print an asterisk (*) next to it.
        // Move to the next day using plusDays(1). If the next day is a Monday, start a new line for the next week's days.
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

    }
}


/*
Detailed explanation of while logic

while (date.getMonthValue() == month) {
This line starts a while loop that continues until the date's month changes. The loop will iterate through all the days of the current month.

System.out.printf("%3d", date.getDayOfMonth());
Inside the loop, this line prints the day of the month (date.getDayOfMonth()) right-aligned within a field of 3 characters. The %3d format specifier ensures that the day is printed using at least 3 characters, creating space for single-digit days.

if (date.getDayOfMonth() == today) { System.out.print("*"); } else { System.out.print(" "); }
This if-else statement checks if the current day being printed (date.getDayOfMonth()) is the same as today's date (today). If it is, an asterisk * is printed next to the day. Otherwise, a space is printed. This marks the current day in the calendar.

date = date.plusDays(1);
After printing the current day, the date variable is incremented by one day using plusDays(1), moving the loop to the next day of the month.

if (date.getDayOfWeek().getValue() == 1) { System.out.println(); }
This if statement checks if the current day (date) is a Monday, indicated by DayOfWeek.MONDAY having a value of 1. If it is Monday, a new line (System.out.println();) is added in the calendar output, indicating the start of a new week in the calendar grid.

This while loop effectively prints the days of the current month in the format:
1 2 3 ...
4 5 6 ...
...
Each row represents a week, and the current day is marked with an asterisk (*). The loop ensures that the days are printed in the correct order and format for the given month. The loop breaks when the month of the date variable changes, indicating the end of the current month.
 */