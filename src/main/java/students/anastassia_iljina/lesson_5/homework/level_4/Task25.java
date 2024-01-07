package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int length = scanner.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число для ячейки [" + i + "]:");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Вы ввели число для ячейки [" + i + "]: " + numbers[i]);
        }
    }
}
