package students.nikolajs_antonovs.lesson_5.level_2.task_12;

import java.util.Random;

class ArrayRandomNumber {

    public static void main(String[] args) {

        int array[] = new int[3];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arrays value " + "[" + i + "]" + ": " + array[i]);
        }
    }
}
