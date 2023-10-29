package students.aleksandrs_kunicins.homework.lesson_5.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите длину массива : ");
        int listLenght = sc.nextInt();
        int[] numbers = new int[listLenght];
        
        for (int i = 0;i<numbers.length;i++){
            System.out.print("Введите число : ");
            int number = sc.nextInt();
            numbers[i] = number;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
