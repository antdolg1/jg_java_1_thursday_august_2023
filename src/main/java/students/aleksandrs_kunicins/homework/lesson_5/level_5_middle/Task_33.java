package students.aleksandrs_kunicins.homework.lesson_5.level_5_middle;

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

