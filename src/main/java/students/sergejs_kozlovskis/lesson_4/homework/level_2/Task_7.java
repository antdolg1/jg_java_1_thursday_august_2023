package students.sergejs_kozlovskis.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите число 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Видите число 2: ");
        int number2 = scanner.nextInt();

        System.out.println(" Наименьшее число:");
        if (number1 == number2)
            System.out.print("Numbers are equals!");
        else System.out.println("Numbers are different!");
    }
}
