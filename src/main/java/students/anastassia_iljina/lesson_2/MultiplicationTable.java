package students.anastassia_iljina.lesson_2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int firstNumber = scanner.nextInt();

        int one = firstNumber * 1;
        int two = firstNumber * 2;
        int three = firstNumber * 3;
        int four = firstNumber * 4;
        int five = firstNumber * 5;
        int six = firstNumber * 6;
        int seven = firstNumber * 7;
        int eight = firstNumber * 8;
        int nine = firstNumber * 9;
        int ten = firstNumber * 10;

        System.out.println(firstNumber + " x 1 = " + one);
        System.out.println(firstNumber + " x 2 = " + two);
        System.out.println(firstNumber + " x 3 = " + three);
        System.out.println(firstNumber + " x 4 = " + four);
        System.out.println(firstNumber + " x 5 = " + five);
        System.out.println(firstNumber + " x 6 = " + six);
        System.out.println(firstNumber + " x 7 = " + seven);
        System.out.println(firstNumber + " x 8 = " + eight);
        System.out.println(firstNumber + " x 9 = " + nine);
        System.out.println(firstNumber + " x 10 = " + ten);


    }
}
