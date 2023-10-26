package students.valeriia_holovan.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("firstNumber =");
        int firstNumber = scanner.nextInt();
        System.out.println("secondNumber =");
        int secondNumber = scanner.nextInt();

        //formula
        int add = firstNumber+secondNumber;
        int substraction = firstNumber-secondNumber;
        int multiply = firstNumber*secondNumber;
        int quotient = firstNumber/secondNumber;

        System.out.println(add);
        System.out.println(substraction);
        System.out.println(multiply);
        System.out.println(quotient);

        scanner.close();
    }
}
