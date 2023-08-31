package students.nikolajs_antonovs.lesson_2.level_1.task_1;

import java.util.Scanner;
import java.text.DecimalFormat;
class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );

        System.out.println("Please, enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Please, enter second number");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;
        String result = decimalFormat.format(division);

        System.out.println("Sum = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + result);
    }
}
