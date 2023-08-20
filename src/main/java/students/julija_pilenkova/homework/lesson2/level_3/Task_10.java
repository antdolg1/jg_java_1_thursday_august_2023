package students.julija_pilenkova.homework.lesson2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Радиус круга: ");
        double radius = scanner.nextDouble();

        //Формула: S = π · r2 , где S это площадь круга, r – радиус, π – пи
        //C = 2 · π · r , где C это периметр, r – радиус, π – число пи.


        double Area = 3.14*radius*radius;
        double Perimetr = 2*3.14*radius;

        System.out.println("Area is: " + Area);
        System.out.println("Perimetr is: " + Perimetr);



    }
}
