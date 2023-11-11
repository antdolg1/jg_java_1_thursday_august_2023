package students.sergejs_kozlovskis.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){

        int i =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Ввидите число :");
        Integer myNumber = scanner.nextInt();
        do {

            System.out.println (myNumber +"*"+ i +"="+ (myNumber  *i));
            i++;
        }
        while (i<=10);

        }
}
