package students.julija_pilenkova.homework.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[3];
        System.out.print("Number one:");
        number[0] = scanner.nextInt();

        System.out.print("Number two:");
        number[1] = scanner.nextInt();

        System.out.print("Number three:");
        number[2] = scanner.nextInt();

        System.out.println(number[0] + " " + number[1] + " " + number[2]);

    }
}
