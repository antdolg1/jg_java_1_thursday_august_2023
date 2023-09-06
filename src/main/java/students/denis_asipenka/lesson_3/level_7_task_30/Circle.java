package students.denis_asipenka.lesson_3.level_7_task_30;

import java.util.Scanner;

public class Circle {
    double radius;
    public void calculateArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        radius = scanner.nextDouble();
        double rezultat;
        rezultat=Math.PI*(radius*radius);
        System.out.println("Площадь круга равна: "+rezultat);
    }
}
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
    }
}
