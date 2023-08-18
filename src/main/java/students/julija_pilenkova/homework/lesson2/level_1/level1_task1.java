package students.julija_pilenkova.homework.lesson2.level_1;

import java.util.Scanner;

public class level1_task1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        int sum1 = num1 + num2;
        int sum2 = num1 - num2;
        int sum3 = num1 * num2;
        int sum4 = num1 / num2;

        System.out.println("Результат сложения:" + sum1);
        System.out.println("Результат вычитания:" + sum2);
        System.out.println("Результат умножения:" + sum3);
        System.out.println("Результат деления:" + sum4);
    }
}
