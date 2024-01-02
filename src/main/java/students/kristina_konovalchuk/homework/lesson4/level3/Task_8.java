package students.kristina_konovalchuk.homework.lesson4.level3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое чило: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе чило:");
        int number2 = scanner.nextInt();


        System.out.println("Введите третье чило:");
        int number3 = scanner.nextInt();
        if (number1 == number2 && number2 ==number3){
            System.out.println("All numbers are equal");

        }if (number1 != number2 && number1 != number3 && number2 != number3){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

}
