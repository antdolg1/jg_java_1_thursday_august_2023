package students.aleksandrs_kunicins.homework.lesson_4.level_6_middle;

import java.util.Arrays;

// Создайте в классе ArrayUtil метод для
// нахождения максимального числа в массиве целых чисел.

class ArrayUtil1 {

    public int findMaxNumber(int[] array) {
        Arrays.sort(array);
        int lastNumber = array.length -1;
        return array[lastNumber]; 
    }

}

