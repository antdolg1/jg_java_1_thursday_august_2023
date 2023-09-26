package students.denis_asipenka.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.searchNumbersPositive();
        test.searchNumbersNegative();
        test.countingOccurrencesPositive();
        test.countingOccurrencesNegative();
        test.replaceFirstTest();
        test.replaceFirstTestNegative();
        test.replaceArrayTest();
        test.sortTest();
    }

    void searchNumbersPositive() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 5, 2, 11, 0};
        int searchNumber = 5;
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.contains(array, searchNumber), "Search numbers");
    }

    void searchNumbersNegative() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 5, 2, 11, 0};
        int searchNumber = 99;
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.contains(array, searchNumber), "Search numbers");
    }

    void countingOccurrencesNegative() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 5, 2, 11, 0};
        int searchNumber = 500;
        int result = 2;
        int resultNumberPrint;
        ArrayService arrayService = new ArrayService();
        resultNumberPrint = arrayService.CountingOccurrences(array, searchNumber);
        String resultStr = String.valueOf(resultNumberPrint);
        checkTestResult(resultNumberPrint == result, "Counting occurrences, number of occurrences: " + resultStr);
    }

    void countingOccurrencesPositive() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 5, 2, 11, 0};
        int searchNumber = 5;
        int result = 2;
        int resultNumberPrint;
        ArrayService arrayService = new ArrayService();
        resultNumberPrint = arrayService.CountingOccurrences(array, searchNumber);
        String resultStr = String.valueOf(resultNumberPrint);
        checkTestResult(resultNumberPrint == result, "Counting occurrences, number of occurrences: " + resultStr);
    }

    void replaceFirstTest() {
        int[] array = new int[]{0, 2, 3, 4, 5, 1, 5, 2, 11, 1};
        int oldNumber = 1;
        int newNumber = 200;
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.replaceFirst(array, oldNumber, newNumber), "Rewriting first occurrence: ");
    }

    void replaceFirstTestNegative() {
        int[] array = new int[]{12, 2, 3, 4, 5, 1, 5, 2, 11, 12};
        int oldNumber = 12;
        int newNumber = 200;
        int result = 2;
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.replaceAllNumber(array, oldNumber, newNumber) == result, "Rewriting all occurrence: ");
    }

    void replaceArrayTest() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        ArrayService arrayService = new ArrayService();
        arrayService.reverseArray(array);
        checkTestResult(Arrays.equals(array, result), "Reverse arrays test: ");
    }

    void sortTest() {
        int[] array = new int[]{1, 23, 7, 90};
        int[] result = new int[]{1, 7, 23, 90};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(array);
        checkTestResult(Arrays.equals(array, result), "Sorted arrays test: ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}