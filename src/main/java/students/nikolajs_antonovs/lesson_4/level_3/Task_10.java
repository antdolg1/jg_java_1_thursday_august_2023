package students.nikolajs_antonovs.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please input second number: ");
        secondNumber = scanner.nextInt();
        System.out.print("Please input third number: ");
        thirdNumber = scanner.nextInt();
        System.out.println("-----");

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.print("Numbers are equals = " + firstNumber);
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.print("Largest number is first number: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.print("Largest number is second number: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Largest number is third number: " + thirdNumber);
        }
    }
}
