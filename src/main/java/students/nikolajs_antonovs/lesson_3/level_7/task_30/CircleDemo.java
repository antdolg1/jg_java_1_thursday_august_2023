package students.nikolajs_antonovs.lesson_3.level_7.task_30;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.calculateArea();
        System.out.println("Circle area is " + area);
    }


}

