package students.kristina_konovalchuk.homework.lesson5.level_2;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random( );
        for (int i = 0; i < 3; i++) {
            arr[i] = random.nextInt( );
        }

        for (int i = 0; i < 3; i++) {
            System.out.println( "Значение ячейки " + i + ":" + arr[i] );
        }
        for (int i = 0; i < 3; i++) {
            arr[i] += 2;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println( "Увеличенное значение ячейки " + i + ":" + arr[i] );
        }

    }
}
