package students.emilija_ostasevska.homework.lesson_5.level_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[2];
        
        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);

        int sum = numbers[0] + numbers[1];

        System.out.println(sum);


    }
}