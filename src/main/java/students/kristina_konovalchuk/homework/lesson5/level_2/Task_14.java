package students.kristina_konovalchuk.homework.lesson5.level_2;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random( );
        for (int i = 0; i < 3; i++) {
            arr[i] = random.nextInt( );
        }
        double average = ( double ) (arr[0] + arr[1] + arr[2]) / 3;
        for (int i = 0; i < 3; i++) {
            System.out.println( "Значение ячейки " + i + ":" + arr[i] );
        }
        System.out.println( "Среднее значение равно :" + average );

    }
}
