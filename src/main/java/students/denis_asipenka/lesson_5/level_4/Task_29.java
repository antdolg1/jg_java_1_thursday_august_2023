package students.denis_asipenka.lesson_5.level_4;

import students.denis_asipenka.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

public class Task_29 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = new int[arrayUtil.createArrayRandom()];
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        arrayUtil.printArrayToConsole(arrayUtil.evenElement(numbers));
    }
}



