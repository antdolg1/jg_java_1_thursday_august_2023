package teacher.lesson_11.lessoncode;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {
        //not sorted
        Map<Integer, String> hashMap = new HashMap<>();

        //sorted in a way added
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //sorted in a natural order (1,2,3...) or (A,B,C...)
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "Ferarri");
        hashMap.put(2, "Porsche");
        hashMap.put(3, "Subaru");
        hashMap.put(4, "Ford");
        hashMap.put(5, "Toyota");
        hashMap.put(6, "VW");
        hashMap.put(7, "BMW");
        hashMap.put(1, "Scania"); // this will replace value - Ferarri under key 1 with new value - Scania

        System.out.println("HashMap content: " + hashMap);

        String car = hashMap.get(2);
        System.out.println("HashMap value with key 2 is: " + car);

        boolean containsKey = hashMap.containsKey(8);
        System.out.println("HashMap contains key with value 8 - " + containsKey);

        boolean containsValue = hashMap.containsValue("Ford");
        System.out.println("HashMap contains value Ford - " + containsValue);

        List<String> hashMapValues = new ArrayList<>(hashMap.values());
        System.out.println("HashMapValue list content: " + hashMapValues);

        System.out.println("HashMap size: " + hashMap.size());

        hashMap.remove(2);

        System.out.println("HashMap is empty: " + hashMap.isEmpty());
    }

}
