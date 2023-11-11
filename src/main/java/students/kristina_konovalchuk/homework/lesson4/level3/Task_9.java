package students.kristina_konovalchuk.homework.lesson4.level3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3){
            System.out.println("Возрастающая");
        } else if (number1 > number2 && number2 >number3) {
            System.out.println("Убывающая");
            
        }else {
            System.out.println("Ни в порядке возрастания, ни в порядке убывания");
        }

    }
}
