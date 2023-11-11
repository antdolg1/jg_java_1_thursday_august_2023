/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
  */
package students.sergejs_kozlovskis.lesson_5.level_2;
import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        //Filling of Random Values
        System.out.println("Filling Array with RANDOM numbers.");
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = random.nextInt(1, 100); //Random value from 1-100
            i++;
        }
        //Printing out
        System.out.println("Numbers are:");
        for (int i = 0; i < numbers.length; ) {
            System.out.println(numbers[i]);
            i++;
        }

        //Each Value + 2
        for (int i = 0; i < numbers.length; ) {
            numbers[i]= numbers[i]+2;
            i++;
        }
        System.out.println("Numbers +2 are:");
        for (int i = 0; i < numbers.length; ) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
