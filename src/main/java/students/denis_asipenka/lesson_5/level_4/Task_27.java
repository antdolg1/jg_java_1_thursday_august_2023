package students.denis_asipenka.lesson_5.level_4;

import students.denis_asipenka.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = new int[arrayUtil.createArrayRandom()];
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println(arrayUtil.findMaxNumber(numbers));
    }
}
