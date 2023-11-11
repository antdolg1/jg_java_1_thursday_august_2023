package students.kristina_konovalchuk.homework.lesson5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Введите длину массива:" );
        int lenghth = scanner.nextInt( );
        int[] array = new int[lenghth];
        Random random = new Random( );
        for (int i = 0; i < lenghth; i++) {
            array[i] = random.nextInt( 150 ) + 1;
        }
        for (int element : array) {
            System.out.println( "Элементы массива: " + element );
        }
        System.out.println( "Чётные числа в массиве: " );
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.println( element );
            }

        }


    }
}
