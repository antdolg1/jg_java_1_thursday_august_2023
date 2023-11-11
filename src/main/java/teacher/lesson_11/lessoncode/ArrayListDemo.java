package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Creating an ArrayList:
        List<String> fruits = new ArrayList<>();

        //Adding elements:
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");

        System.out.println(fruits);
        Set<String> set = new LinkedHashSet<>(fruits);
        System.out.println(set);

        //Accessing elements:
        String firstFruit = fruits.get(0);
        String secondFruit = fruits.get(1);
        System.out.println("First element: " + firstFruit);
        System.out.println("Second fruit: " + secondFruit);

        //Modifying elements:
        fruits.set(1, "Mango");
        secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        //Removing elements:
        fruits.remove(3);

        //Checking the size:
        int size = fruits.size();
        System.out.println("Number of fruits: " + size);

        //Iterating over elements:
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Clearing the list:
        fruits.clear();
        System.out.println("Number of fruits: " + fruits.size());
    }
}
