package students.nikolajs_antonovs.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(result);
    }

}
