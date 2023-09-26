package students.nikolajs_antonovs.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;
            case 7: System.out.println("sunday"); break;
            default: System.out.println("It is not a week day!"); break;

        }
    }

}
