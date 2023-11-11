package students.denis_asipenka.lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Введите первое число:");
        numbers[0] = scanner.nextInt();
        System.out.println("Введите второе число:");
        numbers[1] = scanner.nextInt();
        System.out.println("Введите третье число:");
        numbers[2] = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
