package students.nikolajs_antonovs.lesson_6.level_3;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.containsPositive();
        test.containsNegative();
        test.numberCountPositive();
        test.numberCountNegative();
//        test.replaceFirst();
    }

    void containsPositive() {
        int[] arr = {3, 5, 7, 12, 1};
        int checkNumber = 7;
        boolean existNumber = ArrayService.contains(arr, checkNumber);
        if (existNumber) {
            System.out.println("Array contains " + checkNumber);
        } else {
            System.out.println("Array isn't contains " + checkNumber);
        }
    }

    void containsNegative() {
        int[] arr = {3, 5, 7, 12, 1};
        int checkNumber = 6;
        boolean existNumber = ArrayService.contains(arr, checkNumber);
        if (existNumber) {
            System.out.println("Array contains " + checkNumber);
        } else {
            System.out.println("Test failed");
        }
    }

    void numberCountPositive() {
        int[] arr = {1, 2, 3, 3};
        int numberToSearch = 3;
        int count = ArrayService.countOccurrences(arr, numberToSearch);
        if (count == 2) {
            System.out.println("Number " + numberToSearch + " exist " + count + " times");
        } else {
            System.out.println("Test failed");
        }
    }

    void numberCountNegative() {
        int[] arr = {1, 2, 3, 3};
        int numberToSearch = 4;
        int count = ArrayService.countOccurrences(arr, numberToSearch);
        if (count == 2) {
            System.out.println("Number " + numberToSearch + " exist " + count + " times");
        } else {
            System.out.println("Test failed");
        }
    }

//    void replaceFirst() {
//        int[] arr = {1, 2, 3, 3};
////        int[] expected = {4, 2, 3, 3};
//        int numberToReplace = 1;
//        int newNumber = 4;
//        boolean expected = ArrayService.replaceFirst(arr, numberToReplace, newNumber);
//        if (expected) {
//            System.out.println(true + "Test ok");
//        } else {
//            System.out.println("test failed");
//        }
//    }
}

