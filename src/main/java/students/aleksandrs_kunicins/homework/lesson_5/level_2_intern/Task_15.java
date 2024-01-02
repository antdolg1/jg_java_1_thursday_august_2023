package students.aleksandrs_kunicins.homework.lesson_5.level_2_intern;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random r = new Random();

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = r.nextInt(100);
        }
        System.out.println("Первое значение массива : " + numbers[0]);
        System.out.println("Второе значение массива : " + numbers[1]);
        System.out.println("Третье значение массива : " + numbers[2]);

        for (int i = 0; i<numbers.length;i++){
            numbers[i]+=2;
        }

        System.out.println("Первое значение массива после увеличения  : " + numbers[0]);
        System.out.println("Второе значение массива после увеличения : " + numbers[1]);
        System.out.println("Третье значение массива после увеличения : " + numbers[2]);
    }
}
