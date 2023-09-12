package students.julija_pilenkova.homework.lesson_5.level_4;

import java.util.Collections;

class Task_27 {
    public static void main(String[] args) {

        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int max = array[0];

        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                System.out.println("Max number is: " + array[i]);
            }
        }

    }
}
