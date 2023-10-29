package students.julija_pilenkova.homework.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {

        System.out.print("First number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.print("\nSecond number: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
