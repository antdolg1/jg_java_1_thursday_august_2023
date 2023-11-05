package students.denis_asipenka.lesson_12.level_3.task_19;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        WrongUserInputHandlingDemo demo = new WrongUserInputHandlingDemo();
        demo.writeNumber();
    }

    void writeNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberUser;
        try {
            System.out.println("Введите целое число: ");
            numberUser = scanner.nextInt();
            System.out.println("Спасибо за ввод целого числа: " + numberUser);
            scanner.close();
        } catch (Exception e) {
            writeNumber();
        }
    }
}