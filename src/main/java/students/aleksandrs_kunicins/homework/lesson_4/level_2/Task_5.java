package students.aleksandrs_kunicins.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.print("Введите первое число : ");
        Scanner firstObject = new Scanner(System.in);
        int firstNumber = firstObject.nextInt();
        System.out.print("Введите второе число : ");
        Scanner secondObject = new Scanner(System.in);
        int secondNumber = secondObject.nextInt();


        if (firstNumber>secondNumber){
            System.out.print("Число " +firstNumber+ " больше, чем "+ secondNumber);
        }else if(firstNumber<secondNumber){
            System.out.print("Число " + secondNumber + " больше чем число "+ firstNumber);
        }else if(firstNumber==secondNumber){
            System.out.println("Два числа одинаковы");
        }
        firstObject.close();        
        secondObject.close();
    }
}
