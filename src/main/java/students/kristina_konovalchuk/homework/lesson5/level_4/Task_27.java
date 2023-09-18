package students.kristina_konovalchuk.homework.lesson5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_27 {
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
            System.out.println( "Элементы массива :" + element );
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println( "Наибольшим числом в массиве есть : " + max );
    }
}
