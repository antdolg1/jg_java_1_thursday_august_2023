package students.anastassia_iljina.lesson_5.homework.level_2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        numbers[2] = scanner.nextInt();
        System.out.println("Первое число " + numbers[0]);
        System.out.println("Второе число " + numbers[1]);
        System.out.println("Третье число " + numbers[2]);
    }
}
