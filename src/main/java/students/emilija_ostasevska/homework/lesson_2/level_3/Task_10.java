package students.emilija_ostasevska.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double radius = scanner.nextDouble();

        System.out.println("Периметр: " + (radius * 2 * Math.PI));
        System.out.println("Площадь: " + (radius * radius * Math.PI));
        
        scanner.close();
    }
}