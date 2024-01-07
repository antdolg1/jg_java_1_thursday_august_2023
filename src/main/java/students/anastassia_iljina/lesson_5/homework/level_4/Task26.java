package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива целым числом: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.println("Число в ячейке [" + i + "]: " + numbers[i]);
        }
    }
}
