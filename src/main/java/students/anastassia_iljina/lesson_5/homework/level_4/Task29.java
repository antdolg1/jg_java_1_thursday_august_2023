package students.anastassia_iljina.lesson_5.homework.level_4;

import java.util.Random;

public class Task29 {
    public static void main(String[] args) {
        int[] numbers = new int[26];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(170);
            System.out.println("Число в ячейке [" + i + "] равно " + numbers[i]);
        }
        System.out.println(" ");
        String text = "Четные числа: ";
        String uppercaseText = text.toUpperCase();
        System.out.println(uppercaseText);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

}
