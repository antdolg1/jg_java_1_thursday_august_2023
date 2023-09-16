package students.julija_pilenkova.homework.lesson_6.level_3;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }


        return false;
    }


}
