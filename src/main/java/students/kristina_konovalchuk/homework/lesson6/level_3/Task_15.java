package students.kristina_konovalchuk.homework.lesson6.level_3;

public class Task_15 {
    static class ArrayService {
        int replaceAll(int[] arr, int numberToReplace, int newNumber) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToReplace) {
                    arr[i] = newNumber;
                    count++;
                }
            }
            return count;
        }
    }
}
