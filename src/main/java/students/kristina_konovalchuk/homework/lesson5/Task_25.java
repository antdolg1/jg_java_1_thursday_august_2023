package students.kristina_konovalchuk.homework.lesson5;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Введите длину масива :" );
        int lenght = scanner.nextInt( );
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print( "Введите число для элемента " + i + ":" );
            array[i] = scanner.nextInt( );

        }
        for (int element : array) {
            System.out.println( element );
        }


    }
}
