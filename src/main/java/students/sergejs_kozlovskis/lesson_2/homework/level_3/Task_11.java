package students.sergejs_kozlovskis.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Ввидите первое число :");
        Integer number1 = scanner.nextInt();
        System.out.println ("Ввидите второе число :");
        Integer number2 = scanner.nextInt();
        System.out.println ("Ввидите третие число :");
        Integer number3 = scanner.nextInt();
        float result= ((number1+number2+number3)/3);
        System.out.println ("Среднее арифметическое трёх чисел : "+ result);


    }
}
