package students.aleksandrs_kunicins.homework.lesson_5.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Введите длину массива : ");
        int listLenght = sc.nextInt();
        int[] numbers = new int[listLenght];
        
        for (int i = 0;i<numbers.length;i++){
           int random_number = r.nextInt(100);
           numbers[i] = random_number;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
        
    }
}
