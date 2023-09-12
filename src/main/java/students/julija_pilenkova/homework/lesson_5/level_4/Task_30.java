package students.julija_pilenkova.homework.lesson_5.level_4;

class Task_30 {
    public static void main(String[] args) {

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nOdd numbers: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }


    }
}
