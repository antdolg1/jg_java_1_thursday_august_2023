package students.julija_pilenkova.homework.lesson2.level_3;

import java.util.Scanner;

public class level3_task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;


        System.out.println("Average is: " + average);
    }
}
