package teacher.lesson_10.lessoncode;

import java.util.Scanner;

public class StaticBlock {
    static String text;

    static {
        System.out.println("Static initialization block");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>");

        scanner.nextLine();
        System.out.println(">>>");
        scanner.nextLine();
        System.out.println(">>>");

        scanner.nextLine();
    }
}
