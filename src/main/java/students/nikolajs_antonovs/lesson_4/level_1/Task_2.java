package students.nikolajs_antonovs.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Negative number!");
        } else if(number > 0){
            System.out.println("Positive number!");
        }
        else {
            System.out.println("Number = 0");
        }
    }
}
