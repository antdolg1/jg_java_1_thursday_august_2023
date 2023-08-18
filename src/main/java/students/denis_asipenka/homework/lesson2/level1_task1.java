

package students.denis_asipenka.homework.lesson2;
import java.util.Scanner;
public class level1_task1 {

    public static void main(String[] args){
       // Scanner ol = new Scanner(System.in);
        System.out.println("Введите число:");
        Scanner cislo = new Scanner(System.in);
        int firstNumber = cislo.nextInt();
        System.out.println("Введите число:");
        int numbertwo = cislo.nextInt();

        int sum = firstNumber+numbertwo;
        System.out.println("Результат сложения:");
        System.out.println(sum);
        int subtraction = firstNumber-numbertwo;
        System.out.println("Результат вычетания:");
        System.out.println(subtraction);
        int multiplication = firstNumber*numbertwo;
        System.out.println("Результат умножения:");
        System.out.println(multiplication);
        System.out.println("Результат деления:");
        double division = firstNumber/(double)numbertwo;
        System.out.println(division);



    }



}
