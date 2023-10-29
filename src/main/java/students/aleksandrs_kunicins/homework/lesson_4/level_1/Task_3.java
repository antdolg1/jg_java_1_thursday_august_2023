package students.aleksandrs_kunicins.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Напишите число от 1 до 7 : ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        scanner.close();
        switch (day){
            case 1:
             System.out.println("Pirmdiena");
             break;
            case 2:
            System.out.println("Otrdiena");
            break;
            case 3:
            System.out.println("Tresdiena");
            break;
            case 4:
            System.out.println("Ceturtdiena");
            break;
            case 5:
            System.out.println("Piektdiena");
            break;
            case 6:
            System.out.println("Sestdiena");
            break;
            case 7:
            System.out.println("Svetdiena");
            break;
            default:
            System.out.println("Nepareiza diena");
            break;
        }
        
    }
}
