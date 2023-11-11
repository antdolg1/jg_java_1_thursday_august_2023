package students.emilija_ostasevska.homework.lesson_5.level_2;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[3];
        
        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);

        int av = (numbers[0] + numbers[1] + numbers[2])/3;

        System.out.println(av);


    }
}
