package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.println("Число в ячейке [" + i + "]: " + numbers[i]);
        }

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Наименьшее число в массиве = " + minNumber);
    }
}
