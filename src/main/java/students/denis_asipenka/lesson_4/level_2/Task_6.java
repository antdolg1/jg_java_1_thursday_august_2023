package students.denis_asipenka.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("Меньшие число " + secondNumber);
        } else
            System.out.println("Меньшие число " + firstNumber);
    }
}
