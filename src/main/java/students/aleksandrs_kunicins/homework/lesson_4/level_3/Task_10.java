package students.aleksandrs_kunicins.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите первое число : ");
        Scanner firstObj = new Scanner(System.in);
        int firstNum = firstObj.nextInt();
        System.out.println("Введите второе число : ");
        Scanner secondObj = new Scanner(System.in);
        int secondNum = secondObj.nextInt();
        System.out.println("Введите третье число : ");
        Scanner thirdObj = new Scanner(System.in);
        int thirdNum = thirdObj.nextInt();

        if(firstNum > secondNum && firstNum > thirdNum){
            System.out.println(firstNum + "is the biggest ");
        }else if (secondNum > firstNum && secondNum > thirdNum){
            System.out.println(secondNum + "is the biggest");
        }else if (thirdNum > firstNum && thirdNum >secondNum){
            System.out.println(thirdNum + "is the biggest");
        }
        firstObj.close();
        secondObj.close();
        thirdObj.close();
    }
}
