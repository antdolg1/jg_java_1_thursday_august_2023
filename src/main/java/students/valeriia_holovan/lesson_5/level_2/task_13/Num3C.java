package students.valeriia_holovan.lesson_5.level_2.task_13;

import java.util.Random;

public class Num3C {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nums;
        nums = new int[3];

        int[] joyfulNumbers = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            joyfulNumbers[i]= random.nextInt(350);
        }
        System.out.println("Array or random numbers:");
        for (int num: joyfulNumbers) {
            System.out.print(num + "  ");
        }

        int sum = 0;
        for (int num:joyfulNumbers) {
            sum+= num;
        }
        System.out.println("The sum of all array elements: " + sum);
        }

}
