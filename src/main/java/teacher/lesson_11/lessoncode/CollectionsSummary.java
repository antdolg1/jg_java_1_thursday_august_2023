package teacher.lesson_11.lessoncode;

import java.util.*;

public class CollectionsSummary {

    //Consider
    //1. What collection needs to do?
    //2. Are you using the fastest collection for your purposes?

    //LIST//
    //Stores list(array) of objects
    //Duplicates are allowed
    //Objects remain in the same order they are added
    //Elements are indexed via integer
    //Checking by index is fast
    //Iterating through list is relatively fast
    //We can sort lists with Collections.sort()

    //If you want to add/remove elements in the end, use ArrayList
    List<String> list1 = new ArrayList<>();

    //Elsewhere use LinkedList
    List<String> list2 = new LinkedList<>();


    //SET//
    //Only unique values
    //Great for removing duplicates
    //Not indexed
    //Checking if object exists is fast
    //If you want to use your own objects, you must implement/override equals() and hashCode() methods

    //Order is not important
    Set<String> set1 = new HashSet<>();

    //Order as added
    Set<String> set2 = new LinkedHashSet<>();

    //Natural order
    Set<String> set3 = new TreeSet<>();

    //MAP//
    //Key-value pairs
    //Iterating through map is quite slow
    //If you want to use your own objects, you must implement/override equals() and hashCode() methods
    //Like lookup tables

    //Order of keys is not important and it is okay if it changes
    Map<String, String> map1 = new HashMap<>();

    //Keys stores in same order they are added
    Map<String, String> map2 = new LinkedHashMap<>();

    //Keys are stored in natural order
    Map<String, String> map3 = new TreeMap<>();

}
