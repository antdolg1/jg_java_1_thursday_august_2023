package students.denis_asipenka.lesson_6.level_3;

public class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int CountingOccurrences(int[] arr, int number) {
        int numberOcc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                numberOcc = numberOcc + 1;
            }
        }
        return numberOcc;
    }

    boolean replaceFirst(int[] arr, int oldNumber, int newNumber) {
        int index = -1;
        boolean result = true;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == oldNumber) {
                index = i;
            }
        }
        if (index < 0) {
            result = false;
        } else {
            arr[index] = newNumber;
            result = true;
        }
        return result;
    }

    int replaceAllNumber(int[] arr, int oldNumber, int newNumber) {
        int summRelace = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldNumber) {
                arr[i] = newNumber;
                summRelace = summRelace + 1;
            }
        }
        return summRelace;
    }

    void reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            temp[j - 1] = arr[i];
            j = j - 1;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}