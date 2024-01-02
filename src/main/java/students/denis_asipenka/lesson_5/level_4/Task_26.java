package students.denis_asipenka.lesson_5.level_4;

import students.denis_asipenka.lesson_5.level_5.ArrayUtil;

public class Task_26 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArrayToConsole(arrayUtil.fillArrayWithRandomNumbers(arrayUtil.createArray(arrayUtil.getLengthArraysUser())));
    }
}
