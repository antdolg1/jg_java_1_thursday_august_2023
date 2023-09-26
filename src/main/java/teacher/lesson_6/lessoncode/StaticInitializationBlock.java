package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class StaticInitializationBlock {

    static String staticString;

    //это статический блок инциализации
    static {
        System.out.println("Static block was initialized");
        Scanner scanner = new Scanner(System.in);
        staticString = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("staticString value is " + staticString);
    }
}
