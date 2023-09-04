package students.aleksandrs_kunicins.homework.lesson_4.level_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int userNumber = scanner.nextInt(); 


        if (userNumber>0){
            System.out.println("Число " + userNumber + " является положительным");
        }else if(userNumber<0){
            System.out.println("Число " + userNumber + " является отрицательным");
        }else{
            System.out.println("Ошибка, введите другое чило!!!");
        }
        scanner.close();

    }
}
