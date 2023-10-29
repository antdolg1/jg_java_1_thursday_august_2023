package students.aleksandrs_kunicins.homework.lesson_5.level_2_intern;

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i<numbers.length;i++){
            int r_number = r.nextInt(100);
            numbers[i] = r_number;
        }

        for (int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
