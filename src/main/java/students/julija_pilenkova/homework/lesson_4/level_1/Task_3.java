package students.julija_pilenkova.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        System.out.print("Please, insert number from 1 to 7: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Monday.");
        } else if (number == 2) {
            System.out.println("Tuesday.");
        } else if (number == 3) {
            System.out.println("Wednesday.");
        } else if (number == 4) {
            System.out.println("Thursday.");
        } else if (number == 5) {
            System.out.println("Friday.");
        } else if (number == 6) {
            System.out.println("Sunday.");
        } else if (number == 7) {
            System.out.println("Saturday.");
        } else {
            System.out.println("Wrong number.");
        }


    }
}
