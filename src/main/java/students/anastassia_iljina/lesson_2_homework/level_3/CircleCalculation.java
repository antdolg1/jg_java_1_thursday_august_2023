package students.anastassia_iljina.lesson_2_homework.level_3;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите размер радиуса вещественным числом: ");
        double radius = scanner.nextDouble();

        double circlePerimeter = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is " + circlePerimeter);
        System.out.println("Area is " + circleArea);
    }

}
