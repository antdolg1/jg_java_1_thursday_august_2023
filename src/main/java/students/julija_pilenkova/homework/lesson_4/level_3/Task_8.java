package students.julija_pilenkova.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        System.out.print("First number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.print("\nSecond number: ");
        int num2 = scan.nextInt();

        System.out.print("\nThird number: ");
        int num3 = scan.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
