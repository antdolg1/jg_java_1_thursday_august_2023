package students.emilija_ostasevska.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Сумма: "+ (num1 + num2));
        System.out.println("Разность: "+ (num1 - num2));
        System.out.println("Произведение: "+ (num1 * num2));
        System.out.println("Деление: "+(num1 / num2)); // не было задания учитывать деление на ноль :)  (я знаю про if/else хаха)

        scanner.close();
    }
}