package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class CustomArrayUtilsDemo {
    public static void main(String[] args) {

        int[] numbers = {13, 3423, 22, 2, 567, -34, 0, -12};

        int sum = CustomArrayUtils.sumOfArrayNumbers(numbers);
        System.out.println("Сумма всех чисел в массиве: " + sum);

        int maxNumber = CustomArrayUtils.maxNumberInArray(numbers);
        System.out.println("Самое большое значение в массиве: " + maxNumber);

        int minNumber = CustomArrayUtils.minNumberInArray(numbers);
        System.out.println("Самое маленькое значение в массиве: " + minNumber);

        System.out.println("До сортировки:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, 0, numbers.length);
        System.out.println("После сортировки:");
        System.out.println(Arrays.toString(numbers));

        int index2 = Arrays.binarySearch(numbers, 567);
        System.out.println("Индекс значения 567: " + index2);

    }
}
