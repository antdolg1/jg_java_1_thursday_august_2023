package students.emilija_ostasevska.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        // Добавление элемента в конец списка
        integerList.add(42);

        // Добавление элемента в начало списка
        integerList.add(0, 10);

        // Вывод списка
        System.out.println("List after adding elements: " + integerList);

        // Узнать длину списка
        System.out.println("Length of the list: " + integerList.size());

        // Удаление элемента по индексу
        integerList.remove(1);

        // Вывод списка после удаления
        System.out.println("List after removing element at index 1: " + integerList);

        // Удаление элемента без указания индекса
        integerList.remove(Integer.valueOf(42));

        // Вывод списка после удаления элемента без указания индекса
        System.out.println("List after removing element without index: " + integerList);

        // Проверка на пустоту списка
        System.out.println("Is the list empty? " + integerList.isEmpty());

        // Обход списка и вывод на консоль каждого элемента
        System.out.println("List elements:");
        for (Integer element : integerList) {
            System.out.println(element);
        }
    }
}
