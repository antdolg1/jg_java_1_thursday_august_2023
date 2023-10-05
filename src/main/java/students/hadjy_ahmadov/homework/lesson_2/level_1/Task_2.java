package students.hadjy_ahmadov.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1st number request
        System.out.println("Enter 1st number:");
        double num1 = scanner.nextDouble();

        //2nd number request
        System.out.println("Enter 2nd number:");
        double num2 = scanner.nextDouble();

        //Operations calculation and output of results
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotinent = (double) num1 / num2; // Division as double for precision

        System.out.println("Results:");
        System.out.println("Addition:" +sum);
        System.out.println("Subtraction:" +difference);
        System.out.println("Multiply:" +product);
        System.out.println("Division:" +quotinent);

        //Scanner closing
        scanner.close();


    }
}