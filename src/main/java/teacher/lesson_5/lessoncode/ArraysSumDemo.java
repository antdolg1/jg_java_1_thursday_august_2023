package teacher.lesson_5.lessoncode;

public class ArraysSumDemo {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, -3};
        int sumNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumNumbers = sumNumbers + numbers[i]; //тоже самое что sumNumbers += numbers[i];
        }

        System.out.println("Сумма значений массива numbers = " + sumNumbers);

        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("Самое маленькое число в массиве numbers = " + minNumber);

    }
}
