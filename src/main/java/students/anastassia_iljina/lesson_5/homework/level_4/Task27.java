package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.println("Число в ячейке [" + i + "]: " + numbers[i]);
        }

        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Максимальное значение в массиве = " + maxNumber);
    }
}
