package teacher.lesson_6.lessoncode;

import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {

        int arrayLength = CustomArrayUtils.getArrayLengthFromUser();
        int arrayLength2 = CustomArrayUtils.getArrayLengthFromUser();

        int[] array1 = CustomArrayUtils.createArray(arrayLength);
        int[] array2 = CustomArrayUtils.createArray(arrayLength2);

        CustomArrayUtils.fillArrayWithNumbersFromUser(array1);
        CustomArrayUtils.fillArrayWithNumbersFromUser(array2);

        CustomArrayUtils.fillArrayWithRandomNumbers(array1);
        CustomArrayUtils.fillArrayWithRandomNumbersWithLimit(array2, 100);

        CustomArrayUtils.printArrayToConsole(array1);
        CustomArrayUtils.printArrayToConsole(array2);

        System.out.println("array1 and array2 are the same? - " + CustomArrayUtils.arraysEqual(array1, array2));
        CustomArrayUtils.reverseArray(array2);
        CustomArrayUtils.printArrayToConsole(array2);

        String[] stringArray = {"Red", "Blue", "White"};
        System.out.println("Array stringArray contains word Blue? - " + CustomArrayUtils.containsStringValue(stringArray, "dads"));
    }
}
