package students.valeriia_holovan.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){

        System.out.print("Input number : ");
        int number=new Scanner(System.in).nextInt();

        multiplicationTable(number);
    }
    static void multiplicationTable(int number){
        System.out.println("Expected Output :");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number + " * "+ i +" = "+number*i);
        }
    }
}
