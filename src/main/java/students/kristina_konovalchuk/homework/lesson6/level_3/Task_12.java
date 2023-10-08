package students.kristina_konovalchuk.homework.lesson6.level_3;

public class Task_12 {
    static class ArrayService {
        boolean contains(int[] arr, int numberToSearch) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToSearch) {
                    return true;
                }
            }

            return false;
        }





    }


}
