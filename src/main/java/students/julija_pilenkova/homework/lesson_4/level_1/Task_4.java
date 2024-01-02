package students.julija_pilenkova.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {

        System.out.print("Please, insert your number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }

    }
}
