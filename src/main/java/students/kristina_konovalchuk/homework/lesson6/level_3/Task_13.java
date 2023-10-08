package students.kristina_konovalchuk.homework.lesson6.level_3;

public class Task_13 {
    static class ArrayService{
        public int countOccurrences(int[] arr, int numberToSearch) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToSearch) {
                    count++;
                }
            }
            return count;
        }



    }

}
