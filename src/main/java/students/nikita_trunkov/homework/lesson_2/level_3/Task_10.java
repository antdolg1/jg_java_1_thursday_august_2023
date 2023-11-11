package students.nikita_trunkov.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Perimeter is: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Area is: " + circumference);
    }
}
