package students.kristina_konovalchuk.homework.lesson5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "Введите число для ячейки: " + (i + 1) + ":" );
            numbers[i] = scanner.nextInt( );
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "Значение ячейки: " + (i + 1) + ": " + numbers[i] );
        }

    }
}

