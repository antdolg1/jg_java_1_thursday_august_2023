package students.kristina_konovalchuk.homework.lesson4;

import java.util.Scanner;

public class Task_3 {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 7 : ");

        int number = scanner.nextInt();
        String dayOfWeek;
        switch (number){
            case 1 :
                dayOfWeek = "Monday";
                break;
            case 2 :
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = " Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Неверно . Введите число от 1 до 7 !";


        }
        System.out.println(dayOfWeek);



    }
}
