package students.sergejs_kozlovskis.lesson_4.homework.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите пчисло : ");
        int number = scanner.nextInt();
        if(number > -1) {
            System.out.println(number + "- положительное число" );
        }
         else  System.out.println(number + "- отрицательное число");
        }


    }
