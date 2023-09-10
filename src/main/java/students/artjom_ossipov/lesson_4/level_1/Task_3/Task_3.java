package students.artjom_ossipov.lesson_4.level_1.Task_3;

import java.util.Scanner;

public class Task_3 {
    public static void main (String [] args){
        System.out.println("Введите число от 1 до 7!");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        String dayString;
        switch (dayNumber){
            case 1 : dayString = "Понедельник";
            System.out.println(dayString);
            break;
            case 2 : dayString = "Вторник";
            System.out.println(dayString);
            break;
            case 3 : dayString = "Среда";
            System.out.println(dayString);
            break;
            case 4 : dayString = "Четверг";
            System.out.println(dayString);
            break;
            case 5 : dayString = "Пятница";
            System.out.println(dayString);
            break;
            case 6: dayString = "Суббота";
            System.out.println(dayString);
            break;
            case 7: dayString = "Воскресенье";
            System.out.println(dayString);
            break;
            default: System.out.println("Введите другое число!");
            break;
        }
    }
}
