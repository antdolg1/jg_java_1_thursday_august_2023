package students.aleksandrs_kunicins.homework.lesson_4.level_4_junior;

import java.util.Arrays;
import java.util.Random;

public class Task_28 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[3];
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Минимальное число = "+ numbers[0]);
    }
}

