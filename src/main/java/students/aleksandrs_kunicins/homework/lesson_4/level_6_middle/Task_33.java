package students.aleksandrs_kunicins.homework.lesson_4.level_6_middle;

import java.util.Random;

class ArrayUtil1 {

    public int[] createArray(int arrayLength) {
        // Напишите реализацию !!!
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random r = new Random();
        for (int i = 0;i<array.length;i++){
            array[i] = r.nextInt(100);
        }
    }

}