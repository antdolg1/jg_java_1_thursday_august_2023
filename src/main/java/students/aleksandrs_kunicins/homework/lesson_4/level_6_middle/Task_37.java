package students.aleksandrs_kunicins.homework.lesson_4.level_6_middle;

import java.util.Arrays;

// Создайте в классе ArrayUtil метод для
// нахождения минимального числа в массиве целых чисел.

class ArrayUtil2 {

    public int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

}
