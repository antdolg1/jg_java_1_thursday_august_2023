package students.valeriia_holovan.lesson_5.level_2.task_11;

import java.util.Scanner;

public class Num3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums;
        nums = new int[3];

        for (int i = 0;i < nums.length; i++) {
            System.out.print("Please, enter a number for the cell: ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("The entered array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
