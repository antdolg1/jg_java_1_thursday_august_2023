package students.julija_pilenkova.homework.lesson_6.level_4;

import java.util.Scanner;

public class WhileLoopContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFromUser;
        do {
            System.out.println("Guess the number between 1 to 10 ");
            numFromUser = scanner.nextInt();

        } while (numFromUser != 5);
        System.out.println("Its 5!");


    }
}