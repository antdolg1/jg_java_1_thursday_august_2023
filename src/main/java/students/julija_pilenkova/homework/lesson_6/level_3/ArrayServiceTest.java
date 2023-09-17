package students.julija_pilenkova.homework.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.findNumberInArrayTest();
        test.replaceFirstNumberTest();
        test.replaceAllTest();
        test.reverseArrayTest();
        test.sortArrayTest();
    }

    private void findNumberInArrayTest() {
        ArrayService test = new ArrayService();
        int[] array = {10, 5, 9, 2};
        boolean expectedResult = test.contains(array, 9);
        checkResults(expectedResult, "Find number in array test - ");
    }

    void replaceFirstNumberTest() {
        ArrayService test = new ArrayService();
        int[] array = new int[]{7, 1, 3, 4, 23, 67, 9};
        int newNumber = 99;
        int numberToReplace = 23;
        boolean expectedResult = test.replaceFirst(array, newNumber, numberToReplace);
        checkResults(expectedResult, "Replace number in array test is - ");
    }

    void replaceAllTest() {
        ArrayService test = new ArrayService();
        int[] array = new int[]{5, 1, 45, 8, 5, 9, 22};
        int newNumber = 33;
        int numberToReplace = 5;
        int expectedResult = test.replaceAll(array, newNumber, numberToReplace);
        checkResults(expectedResult == newNumber, "Replace all test is - ");

    }

    void reverseArrayTest() {
        ArrayService test = new ArrayService();
        int [] array = new int[]{1,2,3,4,5,6,7,8,9};
        test.reverseArray(array);
        System.out.println(Arrays.toString(array));

    }

    void sortArrayTest() {
        ArrayService test = new ArrayService();
        int [] array = new int[]{3,65,1,6,98,3456,1};
        test.sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}
