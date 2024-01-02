package students.denis_asipenka.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else
            System.out.println("Число не четное");
    }
}
