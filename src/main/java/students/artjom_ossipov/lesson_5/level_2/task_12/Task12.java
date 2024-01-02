package students.artjom_ossipov.lesson_5.level_2.task_12;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            int r_number = r.nextInt(1000);
            numbers[i] = r_number;
        }
        for (int i=0; i<3; i++){
            System.out.println(numbers[i]);
        }
    }
}
