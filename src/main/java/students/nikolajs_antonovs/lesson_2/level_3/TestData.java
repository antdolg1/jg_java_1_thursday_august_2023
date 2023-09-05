package students.nikolajs_antonovs.lesson_2.level_3;

import java.util.Scanner;

class TestData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.println("Input a number: ");

        int number = scanner.nextInt();
        System.out.println("Expected Output: ");

        for (int i = 1; i <= 10; i++)
        {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }
    }
}
