package students.kristina_konovalchuk.homework.lesson5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_30 {
    public static void main(String[] arsg) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Введите длину массива: " );
        int lenght = scanner.nextInt( );
        int[] array = new int[lenght];
        Random random = new Random( );
        for (int i = 0; i < lenght; i++) {
            array[i] = -random.nextInt( 100 );
        }
        for (int element : array) {
            System.out.println( "Элементы массива: " + element );
        }
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.println( element );
            }
        }
    }
}
