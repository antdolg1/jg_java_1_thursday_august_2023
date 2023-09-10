package students.aleksandrs_kunicins.homework.lesson_5.level_2_intern;
import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число массива : ");
        int first = sc.nextInt();
        System.out.print("Введите второе число массива : ");
        int second = sc.nextInt();
        System.out.print("Введите третье число массива : ");
        int third = sc.nextInt();

        sc.close();

        int[] number = {first,second,third};

        for (int i = 0; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
