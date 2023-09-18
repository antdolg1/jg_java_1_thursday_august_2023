package students.kristina_konovalchuk.homework.lesson5.level_3;

import java.util.Random;
import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Введите длину массива: " );
        int lenght = scanner.nextInt( );
        int[] array = new int[lenght];
        Random random = new Random( );
        for (int i = 0; i < lenght; i++) {
            array[i] = random.nextInt( );
        }
        for (int element : array) {
            System.out.println( element );
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println( "Наименьшим чилом в массиве есть: " + min );
    }
}
