package students.julija_pilenkova.homework.lesson_5.level_2;

class Task_15 {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6};
        int newNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println("---------");

        for (int i = 0; i < numbers.length; i++) {
            newNumbers = numbers[i] + 2;
            System.out.println(newNumbers);

        }


    }
}
