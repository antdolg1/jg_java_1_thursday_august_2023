package students.julija_pilenkova.homework.lesson_5.level_2;

class Task_14 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 13;
        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers = sumNumbers + numbers[i] / numbers.length;
        }
        System.out.println(sumNumbers);


    }
}
