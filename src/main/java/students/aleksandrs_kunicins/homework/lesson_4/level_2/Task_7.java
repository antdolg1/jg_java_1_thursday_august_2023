package students.aleksandrs_kunicins.homework.lesson_4.level_2;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
       System.out.print("Ввдеите первое число : "); 
       Scanner firstObject = new Scanner(System.in);
       int firstNumber = firstObject.nextInt();
       System.out.print("Ввдеите второе число : ");
       Scanner secondObject = new Scanner(System.in);
       int secondNUmber = secondObject.nextInt();
       
       if (firstNumber == secondNUmber){
        System.out.println("Numbers are equals");
       }else{
        System.out.println("Numbers are different");
       }
       firstObject.close();
       secondObject.close();
    }
}
