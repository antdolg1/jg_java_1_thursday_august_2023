package students.julija_pilenkova.homework.lesson_5.level_2;

class Task_13 {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 8};
        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers = sumNumbers + numbers[i];
        }
        System.out.println(sumNumbers);
    }
}
