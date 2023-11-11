package students.emilija_ostasevska.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1-7: ");
        int num = scanner.nextInt();

        if(num == 1){
            System.out.print("Mondey");
        }
        if(num == 2){
            System.out.print("Tuesday");
        }
        if(num == 3){
            System.out.print("Wednesday");
        }
        if(num == 4){
            System.out.print("Thursday");
        }
        if(num == 5){
            System.out.print("Friday");
        }
        if(num == 6){
            System.out.print("Saturday");
        }
        if(num == 7){
            System.out.print("Sunday");
        }
        

        scanner.close();
    }
}
