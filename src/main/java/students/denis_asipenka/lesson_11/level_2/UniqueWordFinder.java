package students.denis_asipenka.lesson_11.level_2;

import java.util.*;

public class UniqueWordFinder {
    Set<String> find(String text) {
        Set<String> listWord = new LinkedHashSet<>();
        String[] word = text.split(" ");
        listWord.addAll(Arrays.asList(word));
        return listWord;
    }

    public static void main(String[] args) {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        System.out.println(uniqueWordFinder.find("ddd hhh fdsf sdfsdf sdfsd ddd hhh"));
    }
}