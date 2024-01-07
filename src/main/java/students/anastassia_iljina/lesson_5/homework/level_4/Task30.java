package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        int[] numbers = new int[16];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Число в ячейке [" + i + "] равно " + numbers[i]);
        }
        System.out.println(" ");
        System.out.println("Не четные числа: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
