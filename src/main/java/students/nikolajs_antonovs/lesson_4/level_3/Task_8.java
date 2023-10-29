package students.nikolajs_antonovs.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {

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
            System.out.print("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.print("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
