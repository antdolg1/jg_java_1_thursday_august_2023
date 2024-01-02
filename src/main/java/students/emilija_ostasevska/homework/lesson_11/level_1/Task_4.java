package students.emilija_ostasevska.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListWithDuplicatesDemo {

    public static void main(String[] args) {
        // Создание списка строк с дубликатами
        List<String> stringListWithDuplicates = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));

        // Вывод списка с дубликатами
        System.out.println("List with duplicates: " + stringListWithDuplicates);
    }
}
