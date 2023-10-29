
/*Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
*/
package students.sergejs_kozlovskis.lesson_5.level_2;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        //Filling
        for(int i=0; i< numbers.length;) {
            System.out.println("Please, enter your number: ");
            numbers[i] = input.nextInt();
            i++;
           }
        //Printing out
        System.out.println("Your entered numbers are:");
        for(int i=0; i< numbers.length;) {
            System.out.println(numbers[i]);
            i++;
        }

    }
}
