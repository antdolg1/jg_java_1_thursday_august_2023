package students.valeriia_holovan.lesson_2.level_2.task_8;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {
        String userName = askForUserName();
        System.out.println("Hello," + userName + "!");
    }
    public static String askForUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

}