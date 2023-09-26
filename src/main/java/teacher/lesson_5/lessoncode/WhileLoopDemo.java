package teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {

//        byte countDown = 5;
//
//        while (countDown >= 0) {
//            System.out.println("До старта: " + countDown);
//            countDown++; //тоже самое как countDown = countDown - 1;
//        }
//
//        System.out.println("Поехали!!!");
//
//        byte myBite = 127;
//        myBite++;
//
//        System.out.println("myBite value is: " + myBite);
//
//        while (1 > 0) {
//            System.out.println("Я БЕСКОНЕЧНЫЙ!");
//        }

        int attemptCount = 3;
        Scanner scanner = new Scanner(System.in);
        String password = "1234";

        while (attemptCount > 0) {
            System.out.println("Please enter password: ");
            if (password.equals(scanner.nextLine())) {
                System.out.println("Password correct! Enjoy your game!");
                break;
            }
            attemptCount--;
            System.out.println("Incorrect password. You have " + attemptCount + " attempts left!");
        }

    }
}
