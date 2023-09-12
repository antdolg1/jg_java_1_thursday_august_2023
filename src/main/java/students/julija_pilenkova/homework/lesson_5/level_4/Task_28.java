package students.julija_pilenkova.homework.lesson_5.level_4;

import java.util.Scanner;

class Task_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int minNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                System.out.println("Min number is: " + minNumber);
            }
        }

    }
}
