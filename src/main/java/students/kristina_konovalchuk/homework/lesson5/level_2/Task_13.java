package students.kristina_konovalchuk.homework.lesson5.level_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random( );
        for (int i = 0; i < 3; i++) {
            arr[i] = random.nextInt( );
        }
        int summCells = 0;
        for (int i = 0; i < 3; i++) {
            summCells += arr[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println( "Значение ячейки " + i + ":" + arr[i] );
        }
        System.out.println( "Сумма всех ячеек: " + summCells );

    }
}
