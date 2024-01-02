package students.denis_asipenka.lesson_7.level_6;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.copyArray();
        test.copyArrayNegative();
    }

    void copyArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberFrom = 4;
        int numberTo = 7;
        int[] result = new int[]{5, 6, 7, 8};
        ArrayCopy arrayCopy = new ArrayCopy();
        checkTestResult(Arrays.equals(arrayCopy.copyInRange(array, numberFrom, numberTo), result), "Copy test result");
    }

    void copyArrayNegative() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberFrom = 4;
        int numberTo = 7;
        int[] result = new int[]{5, 6, 7, 8, 5};
        ArrayCopy arrayCopy = new ArrayCopy();
        checkTestResult(Arrays.equals(arrayCopy.copyInRange(array, numberFrom, numberTo), result), "Copy test result negative");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}