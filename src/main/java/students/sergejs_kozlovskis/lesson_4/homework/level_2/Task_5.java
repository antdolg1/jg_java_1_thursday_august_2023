package students.sergejs_kozlovskis.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите число 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Видите число 2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2)
            System.out.println(" Первое число ("+number1+" больше, чем второе число ("+number2 +')');
        else if (number1 < number2)
            System.out.println(" Первое число ("+number1+" меньше, чем второе число ("+number2 +')');
        else System.out.println(" Первое число ("+number1+") и второе число ("+number2 +") - РАВНЫ");
    }
}