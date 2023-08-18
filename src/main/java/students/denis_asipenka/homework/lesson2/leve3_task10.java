package students.denis_asipenka.homework.lesson2;
import java.util.Scanner;
public class leve3_task10 {
    public static void main(String[] args) {
    System.out.println("Введите радиус круга:");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
double Perimeter = 2*radius*3.14159;
double Area = 3.14159*(radius*radius);

System.out.println("Периметр круга = " + Perimeter);
System.out.println("Площадь круга = " + Area);
}

    }


