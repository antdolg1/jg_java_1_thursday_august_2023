package teacher.lesson_5.lessoncode;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        String[] cars = new String[5];

        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Volvo";
        cars[3] = "VW";
        cars[4] = "Ford";
        cars[1] = "VAZ";

        System.out.println("Значение в первой ячейке массива - " + cars[0]);
        System.out.println("Значение во второй ячейке массива - " + cars[1]);

        String[] cars2 = {"BMW", "Audi", "Volvo"};
        int[] numbers = {1, 12, 123};

        int[] numbers2 = new int[2];
        numbers2[0] = 2;
        System.out.println("Содержание массива numbers2: " + Arrays.toString(numbers2));

        String[] cars3 = new String[] {"BMW", "Audi", "Volvo"};
        //оператор new можно опустить
        //String[] cars3 = {"BMW", "Audi", "Volvo"};

        //вывод всех элементов массива в консоль
        for (int i = 0; i < cars.length; i++) {
            System.out.println("[" + i + "]" + " = " + cars[i]);
        }

        //узнать длинну массива
        System.out.println("Длинна массива под названием cars равна " + cars.length);
        System.out.println("Длинна массива под названием cars2 равна " + cars2.length);

        System.out.println("Содержание массива cars: " + Arrays.toString(cars));
        System.out.println("Содержание массива numbers: " + Arrays.toString(numbers));

    }
}
