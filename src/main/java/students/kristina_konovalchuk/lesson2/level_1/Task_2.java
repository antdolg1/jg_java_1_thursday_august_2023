package students.kristina_konovalchuk.lesson2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введите первое число :" );
        double firstDoubleNumber = scanner.nextDouble( );
        System.out.println( "Введите второе чилсо :" );
        double secondDoubleNumber = scanner.nextDouble( );
        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println( "Сложение :" + sum );
        System.out.println( "Вычитание :" + subtraction );
        System.out.println( "Умножение : " + multiplication );
        System.out.println( "Деление :" + division );

    }
}
