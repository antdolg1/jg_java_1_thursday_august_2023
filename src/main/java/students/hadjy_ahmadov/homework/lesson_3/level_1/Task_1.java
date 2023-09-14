package students.hadjy_ahmadov.homework.lesson_3.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1st number request
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();

        //2nd number request
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();

        //Operations calculation and output of results
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
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