/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */
package students.sergejs_kozlovskis.lesson_5.level_2;
import java.util.Random;
public class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        //Filling of Random Values
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

        //Sum of Array numbers
        int sum = 0;
        for (int i = 0; i < numbers.length; ) {
            sum = sum + numbers[i];
            i++;
        }
        sum = sum / numbers.length;
        System.out.println("Sum of Array is : " + sum);
    }
}