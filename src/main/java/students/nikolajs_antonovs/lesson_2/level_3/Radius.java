package students.nikolajs_antonovs.lesson_2.level_3;

import java.util.Scanner;

class Radius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.print("Radius = ");

        double radius = scanner.nextDouble();
        System.out.println();

        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}



