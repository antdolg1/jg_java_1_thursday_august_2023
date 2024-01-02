package students.kristina_konovalchuk.homework.lesson6.level_3;

public class Task_14 {
    static class ArrayService{
        boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToReplace) {
                    arr[i] = newNumber;
                    return true;
                }
            }
            return false;
        }
    }

}
