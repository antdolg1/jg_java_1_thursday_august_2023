package students.julija_pilenkova.homework.lesson2.level_1;

import java.util.Scanner;

public class level1_task2 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        double num1 = scanner.nextFloat();

        System.out.println("Second number:");
        double num2 = scanner.nextFloat();

        double sum1 = num1 + num2;
        double sum2 = num1 - num2;
        double sum3 = num1 * num2;
        double sum4 = num1 / num2;


        System.out.println("Sum of num 1 and num2 is " + sum1 );
        System.out.println("Substraction of num 1 and num2 is " + sum2 );
        System.out.println("Multiplications of num 1 and num2 is " + sum3 );
        System.out.println("Devision of num 1 and num2 is " + sum4 );
    }
}
