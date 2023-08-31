package students.nikolajs_antonovs.lesson_2.level_3;

import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Input third number: ");
        double thirdNumber = scanner.nextDouble();

        double result = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average = " + result);
    }
}
