package students.nikolajs_antonovs.lesson_6.level_3;

public class ArrayService {

    static boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    static int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int number : arr) {
            if (number == numberToSearch) {
                count++;
            }
        }
        return count;
    }

//    static boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
//        for (int number : arr) {
//            if (arr[number] == numberToReplace) {
//                arr[number] = newNumber;
//                return true;
//            }
//        }
//        return false;
//
//    }
}
