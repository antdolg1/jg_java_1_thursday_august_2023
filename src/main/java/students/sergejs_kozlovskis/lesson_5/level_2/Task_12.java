/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.
 */

package students.sergejs_kozlovskis.lesson_5.level_2;
import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random =new Random();
        //Filling
        for(int i=0; i< numbers.length;) {
            System.out.println("Please, enter your number: ");
            numbers[i] = random.nextInt();
            i++;
        }
        //Printing out
        System.out.println("Numbers are:");
        for(int i=0; i< numbers.length;) {
            System.out.println(numbers[i]);
            i++;
        }

    }
}
