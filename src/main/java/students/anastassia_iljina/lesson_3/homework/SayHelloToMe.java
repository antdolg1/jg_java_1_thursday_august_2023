package students.anastassia_iljina.lesson_3.homework;

import java.util.Scanner;

public class SayHelloToMe {
    public static void main(String[] args) {
        String myName = "Anastassia";
        System.out.println(myName);

        String userName = "Anastassia";
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Как ваше имя?");
        String yourName = scanner.next();

        System.out.println("Hello, " + yourName + "!");

    }
}
