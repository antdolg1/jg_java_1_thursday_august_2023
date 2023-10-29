package students.aleksandrs_kunicins.homework.lesson_5.level_5_middle;

import java.util.Arrays;

// Создайте класс ArrayUtilTest.
// В этом классе напишите автоматический тест
// для метода int[] createArray(int arrayLength)
// из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil au = new ArrayUtil();
        int[] array = au.createArray(3);
        int[] array2 = au.createArray(5); 
        int[] array3 = au.createArray(10); 
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

}
