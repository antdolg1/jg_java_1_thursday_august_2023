package students.nikolajs_antonovs.lesson_2.level_1.task_2;

import java.text.DecimalFormat;
import java.util.Scanner;

class CalculatorDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Please, enter first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please, enter first number");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        String resultSum = decimalFormat.format(sum);
        String resultSub = decimalFormat.format(subtraction);
        String resultMul = decimalFormat.format(multiplication);
        String resultDiv = decimalFormat.format(division);

        System.out.println("Sum = " + resultSum);
        System.out.println("Subtraction = " + resultSub);
        System.out.println("Multiplication = " + resultMul);
        System.out.println("Division = " + resultDiv);
    }
}
