package students.aleksandrs_kunicins.homework.lesson_4.level_2_intern;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] numbers = new int[3];

        int sumResult = 0;

        for (int i = 0;i<numbers.length;i++){
            numbers[i] = r.nextInt(100);
            sumResult += numbers[i];
        }

        System.out.println("Сумма случайных чисел массива равна = "+ sumResult);

    }
}
