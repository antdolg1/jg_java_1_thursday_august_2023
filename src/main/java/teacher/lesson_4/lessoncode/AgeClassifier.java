package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class AgeClassifier {

    public static void main(String[] args) {

        System.out.println("Please enter age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 0 && age <= 10) {
            System.out.println("Baby");
        } else if (age > 10 && age <= 17) {
            System.out.println("Teenager");
        } else if (age > 17 && age <= 30) {
            System.out.println("Student");
        } else if (age > 30 && age <= 60) {
            System.out.println("Adult");
        } else if (age > 60 && age <= 100) {
            System.out.println("Elder");
        } else {
            System.out.println("Dead or undead");
        }

    }

}
