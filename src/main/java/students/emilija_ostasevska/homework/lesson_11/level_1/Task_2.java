package students.emilija_ostasevska.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class ListExample {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        // Добавление строк в список
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // Вывод элементов списка
        System.out.println("Elements in the List:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Создание списка для хранения целых чисел
        List<Integer> integerList = new ArrayList<>();

        integerList.add(42);
        integerList.add(101);
        integerList.add(7);

        // Вывод элементов списка целых чисел
        System.out.println("\nElements in the Integer List:");
        for (Integer element : integerList) {
            System.out.println(element);
        }
    }
}

