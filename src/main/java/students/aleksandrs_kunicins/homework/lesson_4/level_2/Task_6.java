package students.aleksandrs_kunicins.homework.lesson_4.level_2;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        System.out.print("Введите число : ");
        Scanner firstObject = new Scanner(System.in);
        int firstNumber = firstObject.nextInt();
        System.out.print("Введите число : ");
        Scanner secondObject = new Scanner(System.in);
        int secondNumber = secondObject.nextInt();

        if (firstNumber>secondNumber){
            System.out.println("Наименьшее число : "+ secondNumber);
        }else if (firstNumber<secondNumber){
            System.out.println("Наименьшее число : "+ firstNumber);
        }else{
            System.out.println("Try again, javaGuruError");
        }
        firstObject.close();
        secondObject.close();
    }
}
