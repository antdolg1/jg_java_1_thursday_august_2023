package students.denis_asipenka.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int thirdNumber = scanner.nextInt();
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) { // проверка если все 3 равны
            System.out.println("Наибольшие число: " + firstNumber);
        } else if ((firstNumber == secondNumber && firstNumber != thirdNumber)) {   //a==b b!c
            if (firstNumber > thirdNumber) {
                System.out.println("Наибольшие число: " + firstNumber);
            } else System.out.println("Наибольшие число: " + thirdNumber);
        } else if ((secondNumber == thirdNumber) && (firstNumber != secondNumber)) {   // a!=b b==c
            if (firstNumber > secondNumber) {
                System.out.println("Наибольшие число: " + firstNumber);
            } else System.out.println("Наибольшие число: " + secondNumber);
        } else if ((firstNumber == thirdNumber) && (secondNumber != thirdNumber)) {   // a==c b!=c
            if (firstNumber > secondNumber) {
                System.out.println("Наибольшие число: " + firstNumber);
            } else System.out.println("Наибольшие число: " + secondNumber);
        } else {
            if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
                System.out.println("Наибольшие число: " + firstNumber);
            } else if ((firstNumber < secondNumber) && (secondNumber > thirdNumber)) {
                System.out.println("Наибольшие число: " + secondNumber);
            } else if ((firstNumber > secondNumber) && (firstNumber < thirdNumber)) {
                System.out.println("Наибольшие число: " + thirdNumber);
            } else if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
                System.out.println("Наибольшие число: " + thirdNumber);
            }
        }
    }
}



