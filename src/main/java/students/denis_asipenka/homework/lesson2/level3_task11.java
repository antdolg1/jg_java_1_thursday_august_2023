package students.denis_asipenka.homework.lesson2;
import java.util.Scanner;
public class level3_task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число :");
        int cislo1 = scanner.nextInt();
        System.out.println("Введите второе целое число :");
        int cislo2 = scanner.nextInt();
        System.out.println("Введите третье целое число :");
        int cislo3 = scanner.nextInt();
        double average = ((cislo1+cislo2+(double)cislo3)/3);
        System.out.println("Среднее арифметическое число = "+average);
    }
}
