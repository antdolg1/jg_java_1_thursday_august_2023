package students.nikolajs_antonovs.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber | firstNumber < secondNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("The numbers are equals!");
        }
    }
}
