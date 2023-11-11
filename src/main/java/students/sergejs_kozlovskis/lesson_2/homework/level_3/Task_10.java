package students.sergejs_kozlovskis.lesson_2.homework.level_3;
import java.util.Scanner;

public class Task_10 {
    public static void main (String[] args){


        System.out.println ("Ввидите радиус круга :");
        Scanner scanner = new Scanner(System.in);
        float circleRadius = scanner.nextFloat();

        System.out.println ("Периметр круга P="+ (circleRadius*2*3.14));
        System.out.println ("Площадь круга S="+ (circleRadius*circleRadius*3.14));

    }
}
